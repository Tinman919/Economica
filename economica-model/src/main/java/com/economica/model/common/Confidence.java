package com.economica.model.common;

/**
 * Represents confidence in the range [0.0, 1.0].
 */
public record Confidence(double value) {

    public static final Confidence CERTAIN = new Confidence(1.0);
    public static final Confidence UNKNOWN = new Confidence(0.0);

    public Confidence {

        if (Double.isNaN(value)) {
            throw new IllegalArgumentException("Confidence cannot be NaN.");
        }

        if (value < 0.0 || value > 1.0) {
            throw new IllegalArgumentException(
                    "Confidence must be between 0.0 and 1.0."
            );
        }

    }

    public boolean isCertain() {
        return value == 1.0;
    }

    public boolean isUnknown() {
        return value == 0.0;
    }

}
