# Economica Coding Standard

Version: 0.1

---

# Purpose

This document defines the coding conventions used throughout Economica.

The goal is consistency, readability, and long-term maintainability.

---

# Java Version

- Java 21 LTS is the preferred target.
- New language features should only be adopted after evaluating long-term compatibility.

---

# Project Structure

Organize packages by concept, not by technical layer.

Good:

- observation
- world
- inference
- knowledge
- economics

Avoid:

- utils
- helpers
- misc
- common2

---

# Immutability

Prefer immutable objects.

Use Java records whenever they represent immutable data.

Avoid mutable shared state.

---

# Interfaces

Use interfaces to describe behavior.

Do not create interfaces with only one implementation unless there is a clear architectural reason (for example, defining a stable public API or enabling future implementations).

---

# Dependency Injection

Use constructor injection.

Do not use global service locators.

Avoid mutable singletons.

---

# Naming

Classes:
- PascalCase

Methods:
- camelCase

Constants:
- UPPER_SNAKE_CASE

Packages:
- lowercase

Names should describe concepts, not implementations.

---

# Documentation

Every public class should include Javadoc describing:

- Purpose
- Responsibilities
- Important invariants

Complex algorithms should include explanatory comments.

---

# Testing

Every public subsystem should have tests.

Tests should focus on observable behavior, not implementation details.

Prefer deterministic tests.

---

# Exceptions

Fail fast when invariants are violated.

Use checked exceptions sparingly.

Do not swallow exceptions silently.

---

# Logging

Use structured logging.

Avoid logging inside low-level value objects.

---

# General Principles

- Prefer clarity over cleverness.
- Prefer composition over inheritance.
- Keep methods focused on one responsibility.
- Keep public APIs small and stable.
- Refactor before complexity accumulates.

---

# Rule of Thumb

Future contributors should understand a class within a few minutes of opening it.