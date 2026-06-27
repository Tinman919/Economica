package com.economica.model.timeseries;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeSeriesTest {

    @Test
    void createsSeries() {

        TimeSeries<Double> series =
                TimeSeries.of(List.of(
                        TimePoint.of(
                                Instant.parse("2026-01-01T00:00:00Z"),
                                100.0
                        ),
                        TimePoint.of(
                                Instant.parse("2026-01-02T00:00:00Z"),
                                101.5
                        )
                ));

        assertEquals(2, series.size());
        assertEquals(100.0, series.first().value());
        assertEquals(101.5, series.last().value());

    }

}
