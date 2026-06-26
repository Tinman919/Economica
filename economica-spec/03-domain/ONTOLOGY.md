# Economica Ontology

Version: 0.1

---

# Purpose

The ontology defines the vocabulary of Economica.

Every important concept has exactly one definition.

Code should reflect these definitions.

---

# Core Scientific Concepts

## Observation

An immutable record describing something that happened.

Observations are the raw input to the framework.

An observation makes no claims about meaning.

It simply records that something occurred.

Examples:

- An item traded.
- A price changed.
- A player bought an item.
- A stock closed higher.

---

## Evidence

Evidence is structured information derived directly from one or more observations.

Evidence supports scientific reasoning.

Evidence is objective.

---

## Inference

Inference is the process of transforming observations and evidence into knowledge.

Inference may combine:

- observations
- evidence
- existing world state

to produce new understanding.

---

## Knowledge

Knowledge is an evidence-backed scientific statement.

Knowledge should always be explainable.

Every knowledge object should eventually answer:

"What evidence supports this conclusion?"

---

## Entity

An entity is something that exists within the world model.

Examples:

- Item
- Player
- Currency
- Organization
- Market
- Exchange

Entities persist across observations.

---

## Relationship

A relationship describes a connection between entities.

Relationships may change over time.

Examples:

- Correlation
- Dependency
- Supply Chain
- Ownership
- Competition

---

## World

The World represents the current scientific understanding of the system being studied.

The World is immutable.

Each successful inference produces a new World.

---

# Economic Concepts

## Capital

Economic value capable of flowing through the system.

---

## Liquidity

The ability for capital to move efficiently.

---

## Flow

Movement of capital, resources, or information through an economy.

---

## Market Regime

A persistent state describing how markets are behaving.

Examples:

- Expansion
- Contraction
- Panic
- Recovery

---

## Community

A group of entities exhibiting stronger relationships with each other than with the surrounding system.

---

# Engineering Concepts

## Kernel

The scientific core of the framework.

The kernel knows nothing about specific applications.

---

## Adapter

An application-specific layer responsible for converting external data into observations.

Examples:

- OSRS Adapter
- NYSE Adapter
- EVE Adapter

---

## Investigation

A repeatable scientific process for answering a research question.

Investigations consume knowledge from the World.

---

# Guiding Rule

If a concept cannot be clearly defined, it should not yet exist in the implementation.