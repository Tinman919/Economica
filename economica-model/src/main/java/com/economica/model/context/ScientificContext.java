package com.economica.model.context;

import com.economica.model.entity.Entity;
import com.economica.model.evidence.Evidence;
import com.economica.model.knowledge.Knowledge;
import com.economica.model.observation.Observation;
import com.economica.model.relationship.Relationship;

import java.util.List;
import java.util.Objects;

/**
 * Immutable snapshot of a scientific world.
 */
public record ScientificContext(

        List<Entity> entities,
        List<Observation> observations,
        List<Relationship> relationships,
        List<Evidence> evidence,
        List<Knowledge> knowledge

) {

    public ScientificContext {

        entities = List.copyOf(
                Objects.requireNonNull(entities));

        observations = List.copyOf(
                Objects.requireNonNull(observations));

        relationships = List.copyOf(
                Objects.requireNonNull(relationships));

        evidence = List.copyOf(
                Objects.requireNonNull(evidence));

        knowledge = List.copyOf(
                Objects.requireNonNull(knowledge));

    }

    public static ScientificContext empty() {

        return new ScientificContext(

                List.of(),
                List.of(),
                List.of(),
                List.of(),
                List.of()

        );

    }

}
