package com.economica.model.measurement;

import com.economica.model.common.Confidence;
import com.economica.model.common.Source;
import com.economica.model.common.Unit;

import java.util.Objects;

/**
 * Represents a scientific measurement.
 *
 * A measurement is a value together with its metadata.
 * It deliberately contains no timestamp; time belongs to
 * the observation in which the measurement was recorded.
 */
public record Measurement<T>(
        T value,
        Unit unit,
        Confidence confidence,
        Source source
) {

    public Measurement {

        Objects.requireNonNull(value);
        Objects.requireNonNull(unit);
        Objects.requireNonNull(confidence);
        Objects.requireNonNull(source);

    }

}
