# Economica Architecture

Version: 0.1

---

# Purpose

This document defines the architectural blueprint of Economica.

It is the authoritative description of how every subsystem fits together.

Whenever implementation and documentation disagree, this document should be updated before new development continues.

---

# Architectural Philosophy

Economica is not an application.

It is a framework.

Applications are built on top of the framework.

Example applications include:

- Old School RuneScape
- EVE Online
- Stock Markets
- Cryptocurrency
- Supply Chains

The kernel should never depend upon a specific application.

Dependencies always point toward the kernel.

---

# High-Level Architecture

┌────────────────────────────┐
│ Applications               │
│                            │
│ OSRS                       │
│ EVE                        │
│ NYSE                       │
│ Crypto                     │
└──────────────┬─────────────┘
│
▼
┌────────────────────────────┐
│ Domain Extensions          │
│                            │
│ Economics                  │
│ Community Detection        │
│ Capital Flow               │
│ Market Regimes             │
└──────────────┬─────────────┘
│
▼
┌────────────────────────────┐
│ Scientific Kernel          │
│                            │
│ Observation                │
│ Evidence                   │
│ Inference                  │
│ Knowledge                  │
│ World Model                │
└──────────────┬─────────────┘
│
▼
┌────────────────────────────┐
│ Foundation                 │
│                            │
│ Identifiers                │
│ Time                       │
│ Confidence                 │
│ Collections                │
│ Utilities                  │
└────────────────────────────┘

---

# Layers

## Foundation

The Foundation contains reusable primitives.

Examples:

- Identifier
- Confidence
- Version
- Probability
- TimeRange

The Foundation knows nothing about science.

---

## Scientific Kernel

The Kernel transforms observations into knowledge.

Major concepts:

Observation

↓

Evidence

↓

Inference

↓

Knowledge

↓

World

The Kernel knows nothing about economics.

---

## Domain Extensions

Economic reasoning is implemented here.

Examples:

- Liquidity
- Capital
- Supply
- Demand
- Market Regimes
- Communities

This layer consumes scientific knowledge.

It never changes the scientific kernel.

---

## Applications

Applications provide observations.

Applications never modify kernel behavior.

They simply adapt external systems.

---

# World Model

The World is the central object of the framework.

Everything else exists to construct or improve the World.

A World contains:

- Entities
- Relationships
- Observations
- Knowledge
- History

Worlds are immutable.

Each inference produces a new World.

---

# Inference

Inference is the core algorithm.

Input

(World, Observation)

↓

Output

New World

Inference is responsible for coordinating:

- Identity Resolution
- Evidence Construction
- Knowledge Generation
- World Update

Inference should remain deterministic whenever practical.

---

# Dependency Rules

Allowed

Foundation

↓

Kernel

↓

Domain

↓

Applications

Forbidden

Applications

↓

Kernel internals

Forbidden

Economics

↓

Foundation

Forbidden

OSRS

↓

Kernel internals

---

# Design Principles

The architecture follows these rules.

## Immutability

Prefer immutable objects.

Prefer records.

Avoid shared mutable state.

---

## Constructor Injection

Dependencies are supplied through constructors.

Avoid service locators.

Avoid global singletons.

---

## Interfaces

Interfaces describe behavior.

Records describe data.

Implementations remain replaceable.

---

## Package by Concept

Prefer

observation/

knowledge/

world/

inference/

Avoid

util/

helpers/

misc/

common2/

---

## Testability

Every subsystem should be independently testable.

No subsystem should require a UI.

---

## Explainability

Every important inference should eventually explain itself.

The framework should not produce conclusions that cannot be traced back to evidence.

---

# Future Architecture

Eventually the repository should become a Gradle multi-module project.

Example

economica-kernel

economica-economics

economica-osrs

economica-studio

economica-cli

economica-spec

Each module should have clearly defined responsibilities.

---

# Guiding Principle

Build the smallest architecture capable of supporting decades of growth.

Optimize for clarity before optimization.

Optimize for understanding before performance.