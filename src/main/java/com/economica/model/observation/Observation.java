package com.economica.model.observation;

import com.economica.model.common.ScientificObject;

import java.time.Instant;
import java.util.Map;
import java.util.Objects;

/**
 * A single observation made about the world.
 */
public record Observation(

        String subject,
        String attribute,
        Object value,
        Instant observedAt,
        String source,
        Map<String, Object> metadata

) implements ScientificObject {

    public Observation {

        Objects.requireNonNull(subject);
        Objects.requireNonNull(attribute);
        Objects.requireNonNull(observedAt);
        Objects.requireNonNull(source);

        metadata = metadata == null
                ? Map.of()
                : Map.copyOf(metadata);

    }

}
