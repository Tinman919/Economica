package com.economica.model.common;

import java.util.UUID;

/**
 * Immutable globally unique identifier.
 */
public record Identifier(UUID value) {

    public Identifier {
        if (value == null) {
            throw new IllegalArgumentException("Identifier cannot be null");
        }
    }

    public static Identifier random() {
        return new Identifier(UUID.randomUUID());
    }

}
