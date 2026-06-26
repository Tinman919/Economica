# ADR-0001: Project Architecture

## Status

Accepted

## Context

Economica is intended to become a long-lived scientific reasoning framework.
As the codebase grows, a single-module project would make dependency
management, publishing, testing, and maintenance increasingly difficult.

## Decision

Economica will be organized as a Gradle multi-module project.

Current modules:

- economica-model
- economica-core
- economica-engine
- economica-storage
- economica-api
- economica-cli
- economica-examples
- economica-bom

Dependencies flow inward toward the model.

The model module must not depend on any other Economica module.

## Consequences

Advantages:

- Clear dependency graph.
- Independent testing.
- Independent publishing.
- Faster builds.
- Easier long-term maintenance.

Tradeoffs:

- Slightly more Gradle configuration.
- More modules to manage.

