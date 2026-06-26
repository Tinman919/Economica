# Economica Principles

Version: 0.1

---

# Purpose

These principles define the permanent engineering philosophy of Economica.

Unlike implementation details, these principles should remain stable for many years.

Every architectural decision should be evaluated against them.

---

# Principle 1

Science Before Economics

Economica is fundamentally a scientific inference engine.

Economics is one application of that engine.

The scientific kernel should remain independent of economic concepts.

---

# Principle 2

Evidence Before Conclusions

Every conclusion must be traceable back to evidence.

If a conclusion cannot explain why it exists, it should not exist.

---

# Principle 3

Immutability First

Immutable objects are preferred whenever practical.

State changes produce new objects rather than mutating existing ones.

---

# Principle 4

Small, Composable Systems

Every subsystem should have one responsibility.

Large systems should emerge through composition rather than complexity.

---

# Principle 5

Deterministic Behavior

Given identical inputs, the kernel should produce identical outputs.

Randomness should only exist when explicitly modeled.

---

# Principle 6

Replaceability

Every major subsystem should eventually be replaceable without changing the rest of the framework.

Examples include:

- Identity Resolution
- Community Detection
- Regime Detection
- Capital Flow

---

# Principle 7

Explainability

The framework should eventually explain every significant inference.

Users should understand both:

What the system believes.

Why it believes it.

---

# Principle 8

Testability

Every subsystem should be independently testable.

No subsystem should require a graphical interface.

---

# Principle 9

Long-Term Stability

Optimize for a codebase that remains understandable ten years from now.

Avoid cleverness.

Prefer clarity.

---

# Principle 10

Architecture Before Implementation

A feature should be designed before it is implemented.

Specifications precede code.

Code follows architecture.

---

# Guiding Question

Whenever uncertainty exists, ask:

"Which choice makes the system easier to understand five years from now?"