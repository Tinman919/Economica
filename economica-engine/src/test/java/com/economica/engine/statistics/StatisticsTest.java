package com.economica.engine.statistics;

import com.economica.model.timeseries.TimePoint;
import com.economica.model.timeseries.TimeSeries;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatisticsTest {

    private TimeSeries<Double> sampleSeries() {

        return TimeSeries.of(List.of(

                TimePoint.of(
                        Instant.parse("2026-01-01T00:00:00Z"),
                        10.0
                ),

                TimePoint.of(
                        Instant.parse("2026-01-02T00:00:00Z"),
                        20.0
                ),

                TimePoint.of(
                        Instant.parse("2026-01-03T00:00:00Z"),
                        30.0
                )

        ));

    }

    @Test
    void computesSum() {
        assertEquals(60.0, Statistics.sum(sampleSeries()), 1e-9);
    }

    @Test
    void computesMean() {
        assertEquals(20.0, Statistics.mean(sampleSeries()), 1e-9);
    }

    @Test
    void computesMin() {
        assertEquals(10.0, Statistics.min(sampleSeries()), 1e-9);
    }

    @Test
    void computesMax() {
        assertEquals(30.0, Statistics.max(sampleSeries()), 1e-9);
    }

    @Test
    void computesRange() {
        assertEquals(20.0, Statistics.range(sampleSeries()), 1e-9);
    }

    @Test
    void computesVariance() {
        assertEquals(
                66.66666666666667,
                Statistics.variance(sampleSeries()),
                1e-9
        );
    }

    @Test
    void computesStandardDeviation() {
        assertEquals(
                Math.sqrt(66.66666666666667),
                Statistics.standardDeviation(sampleSeries()),
                1e-9
        );
    }

}