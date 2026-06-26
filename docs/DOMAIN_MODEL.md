# Economica Domain Model

## Purpose

Economica is a scientific reasoning framework.

Its goal is to transform observations into knowledge through reproducible
algorithms while preserving provenance, confidence, and traceability.

---

# Scientific Pipeline

Raw Data

↓

Observation

↓

Evidence

↓

Knowledge

↓

Inference

↓

Prediction

↓

Simulation

---

# Core Concepts

## Observation

An immutable statement describing something observed about the world.

Examples:

- "Twisted Bow traded for 1.73B GP."
- "Temperature measured 22.3 °C."
- "Tree height is 14.2 m."

---

## Evidence

A collection of observations supporting a conclusion.

---

## Knowledge

Validated evidence accepted as true within a context.

---

## Entity

Anything that exists in the modeled world.

Examples:

- Person
- Item
- Company
- Country
- Market
- Planet

---

## Relationship

A typed connection between entities.

Examples:

- owns
- contains
- trades_with
- located_in
- depends_on

---

## Inference

A rule that derives new knowledge from existing knowledge.

---

## Prediction

An inference whose result concerns the future.

---

## Simulation

A system that executes hypothetical worlds under different assumptions.

---

# Module Responsibilities

economica-model

Immutable domain model only.

No algorithms.

No persistence.

No networking.

No framework dependencies.

---

economica-core

Kernel.

Runtime.

Lifecycle.

Dependency management.

---

economica-engine

Scientific algorithms.

Inference.

Economics.

Graph algorithms.

Statistics.

Simulation.

---

economica-storage

Persistence.

Serialization.

Import/export.

---

economica-api

Public API.

---

economica-cli

Developer and user tooling.

---

economica-examples

Reference implementations.

Tutorials.

