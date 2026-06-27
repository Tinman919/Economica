package com.economica.model.timeseries;

import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimePointTest {

    @Test
    void createsTimePoint() {

        Instant now = Instant.parse("2026-01-01T00:00:00Z");

        TimePoint<Double> point =
                TimePoint.of(now, 123.45);

        assertEquals(now, point.timestamp());
        assertEquals(123.45, point.value());

    }

}
