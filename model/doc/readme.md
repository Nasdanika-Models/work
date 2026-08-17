
```drawio-resource
../work.drawio
```


An [Ecore](https://www.eclipse.org/modeling/emf/) micro-model of work to be done at the model element level: what needs doing, on what, in what order, defined in [`Work.xcore`](Work.xcore). See [`assessment.md`](assessment.md) for the industry landscape and the naming rationale.

## Why "Work"

The industry converged on the word: Atlassian retired "issue" in 2025, and "Work" is now its collective term for everything tracked in Jira; Azure DevOps has always said work item; OMG Essence has Work as a kernel alpha. `WorkItem` and `WorkPackage` are narrower crosswalk terms: a leaf `Work` is a work item (Jira, ADO) or activity (PMBOK); a `Work` containing work is an epic, feature, summary task, or WBS work package. One nested class covers the whole spectrum; the type distinction is data (`WorkType`), not metamodel, exactly as trackers treat it.

| This model | Jira | Azure DevOps | PMBOK / WBS |
|---|---|---|---|
| leaf `Work` | work item | work item | activity / task |
| non-leaf `Work` | epic | feature / epic | summary task / work package |
| `WorkType` | issue type | work item type | (n/a, level) |
| `DependencyType` | link type | link type | (n/a) |
| `TemporalConstraint` | (n/a) | (n/a) | FS / SS / FF / SF + lag |
| `Work.impacts` | components / affects version | area path (loosely) | (n/a) |

Carrying both link semantics and scheduling constraints is deliberate: practitioners currently choose between a tracker (links, no scheduling semantics) and a scheduler (FS/SS/FF/SF, no link semantics).

## The pattern

Same shape as the [product management model](https://product-management.models.nasdanika.org/): `AbstractWork` as the common base, `Work` as the concrete definition, `WorkReference` for citing work published in another model, `Workable` as the containment mixin. `Work extends Workable`, so work nests. Dependencies target `AbstractWork`, so a backlog can depend on another team's published work the way code depends on a Maven artifact.

## Work as an aspect target

`Workable` is the point of the model: work attaches to the model element it is about. A capability, an agent, an MCP server, a control, a dataset, a document becomes `Workable` and then "what work exists on this element" and "what is this work about" are queries over the graph rather than free-text links in a tracker.

Containment gives work one home; `Work.impacts` records what else the work touches (the Jira components crosswalk). The distinction matters in a federation: impacts point outward from your model to elements you do not own, so declaring blast radius requires no edit to the impacted element's model, and impacted elements need not be `Workable` at all.

Work itself composes the other aspect models:

* **Staged** (lifecycle model): work state, transitions, and availability windows come from the lifecycle aspect. No status enum here; a workflow is a lifecycle.
* **Undergoer** (role model): assignee, reviewer, approver are role engagements, not attributes.
* **Governed** (governance model): schedule and delivery risks take work as their `Risk.subject`; change records are the evidence auditors ask for; a governance `Finding` traces to the remediation `Work` that closes it.

### Upgrade classes

The work package also contains classes that extend both `Workable` and an aspect class from a dependency package: `Staged`, `Undergoer`, `Governed`. An element modeled as a plain lifecycle `Staged` is upgraded to a workable `Staged` by switching its nsURI to the work model; the Groovy DSL resolves the most specific class and nothing else in the document changes. This gives every aspect model a workable variant without touching the aspect model.

## Loading work from where it is born

Work breakdown happens in spreadsheets and diagrams before it is retyped into a tracker. Core-scope loaders treat those artifacts as source rather than export:

* **Excel**: backlog and WBS spreadsheets, one row per work, columns mapped to type, estimate, dates, dependencies.
* **Draw.io**: nodes as work, edges as dependencies, containment as nesting.
* **PlantUML**: WBS diagrams as work hierarchy; activity diagrams as work plus finish-to-start dependencies.

`AbstractWork.origin` keeps the URI of the source cell or node, so the trace survives loading and round-trips are possible. This is draw first, execute later applied to planning.

Integration models map to live trackers, named by system: `jira.work` maps `WorkType` to issue types, `DependencyType` to link types, leaf `Work` to work items; an `ado.work` sibling would do the same for Azure DevOps. Sync direction and conflict policy live in the integration models, not here.

## Model overview

| Area | Types |
|------|-------|
| Base | `ModelElement`, `Property` |
| Types | `WorkType`, `DependencyType` (classes, instance data) |
| Pattern | `Workable`, `AbstractWork`, `Work`, `WorkReference` |
| Dependencies | `Dependency`, `TemporalConstraint` |
| Root | `WorkDomain` |
| Aspect upgrades | `Governed` (active), `Staged` / `Undergoer` (pending classpath) |

## Relation to other Nasdanika work

The [governance model](../governance/README.md) supplies `GovernedElement`; findings and controls generate work, and work carries risk. The lifecycle and role models supply state and assignment. The [MCP](../mcp/README.md) and agent models supply elements work is about, and an agent planning over the model reads a typed backlog rather than scraping a tracker API. The work-as-code niche (Backlog.md and kin) validates git-native, agent-native work tracking; this model adds types, dependency semantics, federation, and attachment to model elements.

> *Editor's note for Pavel: lifecycle and role model nsURIs and class names (Staged, Undergoer) are assumed; verify against the published models and uncomment the two upgrade classes once the models are on the classpath. Cross-package inheritance needs the micro-models to converge on a shared base (Ncore ModelElement) to avoid duplicate-feature diamonds; today each micro-model declares its own ModelElement. Also decide whether estimate/actual deserve a typed Duration instead of String.*

