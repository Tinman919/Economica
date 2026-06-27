package com.economica.model.timeseries;

import java.time.Instant;
import java.util.Objects;

/**
 * Represents a value observed at a specific instant in time.
 *
 * @param <T> the type of value being observed
 */
public record TimePoint<T>(
        Instant timestamp,
        T value
) {

    public TimePoint {

        Objects.requireNonNull(timestamp, "timestamp");
        Objects.requireNonNull(value, "value");

    }

    public static <T> TimePoint<T> of(
            Instant timestamp,
            T value
    ) {
        return new TimePoint<>(timestamp, value);
    }

}
