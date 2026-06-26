package com.economica.model.common;

/**
 * Describes where a scientific object originated.
 */
public record Source(String value) {

    public Source {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Source cannot be blank");
        }
    }

}
