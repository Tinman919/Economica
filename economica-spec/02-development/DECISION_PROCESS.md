# Economica Decision Process

Version: 0.1

---

# Purpose

This document defines how architectural and engineering decisions are made.

The goal is consistency.

---

# Before Adding Anything

Ask:

1. Does this concept already exist?

2. Does this belong in the kernel?

3. Does this violate the architecture?

4. Can it be explained simply?

5. Will it make the system easier to understand five years from now?

If the answer to Question 5 is "no", reconsider.

---

# Before Writing Code

Every feature should have:

- Motivation
- Specification
- Acceptance Criteria

Only then should implementation begin.

---

# Before Merging

Verify:

- Builds successfully
- Tests pass
- Documentation updated
- Decision recorded (if architectural)

---

# Decision Priority

1. Principles
2. Vision
3. Architecture
4. Ontology
5. Coding Standard
6. Implementation

Higher-level documents always take precedence.

---

# Guiding Principle

Prefer improving the architecture over adding another feature.