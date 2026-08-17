
```drawio-resource
../work.drawio
```


An [Ecore](https://ecore.models.nasdanika.org/) micro-model of work to be done at the model element level: what needs doing, on what, in what order.

## Work as an aspect target

`Workable` is the point of the model: work attaches to the model element it is about. A capability, an agent, an MCP server, a control, a dataset, a document becomes `Workable` and then "what work exists on this element" and "what is this work about" are queries over the graph rather than free-text links in a tracker.

Containment gives work one home; `Work.impacts` records what else the work touches (the Jira components crosswalk).
The distinction matters in a federation: impacts point outward from your model to elements you do not own, so declaring blast radius requires no edit to the impacted element's model, and impacted elements need not be `Workable` at all.

Work itself composes the other aspect models:

* [**Staged**](https://lifecycle.models.nasdanika.org/references/eClassifiers/Staged/index.html) (lifecycle model): work state, transitions, and availability windows come from the lifecycle aspect. No status enum here; a workflow is a lifecycle.
* [**Undergoer**](https://role.models.nasdanika.org/references/eClassifiers/Undergoer/index.html) (role model): assignee, reviewer, approver are role engagements, not attributes.
* [**Governed**](https://governance.models.nasdanika.org/references/eClassifiers/Governed/index.html) (governance model): schedule and delivery risks take work as their `Risk.subject`; change records are the evidence auditors ask for; a governance `Finding` traces to the remediation `Work` that closes it.

### Upgrade classes

The work package also contains classes that extend both `Workable` and an aspect class from a dependency package: `Staged`, `Undergoer`, `Governed`.
An element modeled as a plain lifecycle `Staged` is upgraded to a workable `Staged` by switching its nsURI to the work model; the Groovy DSL resolves the most specific class and nothing else in the document changes.
This gives every aspect model a workable variant without touching the aspect model.

## Loading work from where it is born

Work breakdown happens in spreadsheets and diagrams before it is retyped into a tracker. Core-scope loaders treat those artifacts as source rather than export:

* **Excel**: backlog and WBS spreadsheets, one row per work, columns mapped to type, estimate, dates, dependencies.
* **Draw.io**: nodes as work, edges as dependencies, containment as nesting.
* **PlantUML**: WBS diagrams as work hierarchy; activity diagrams as work plus finish-to-start dependencies.

## Model overview

| Area | Types |
|------|-------|
| Base | `ModelElement`, `Property` |
| Types | `WorkType`, `DependencyType` (classes, instance data) |
| Pattern | `Workable`, `AbstractWork`, `Work`, `WorkReference` |
| Dependencies | `Dependency`, `TemporalConstraint` |
| Root | `WorkDomain` |
| Aspect upgrades | `Governed`, `Staged`, `Undergoer` |
