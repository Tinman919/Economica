package com.economica.engine.statistics;

import com.economica.model.timeseries.TimeSeries;

import java.util.Objects;

/**
 * Basic descriptive statistics for numeric time series.
 */
public final class Statistics {

    private Statistics() {
    }

    public static double sum(TimeSeries<Double> series) {

        requireNotEmpty(series);

        double sum = 0.0;

        for (var point : series) {
            sum += point.value();
        }

        return sum;
    }

    public static double mean(TimeSeries<Double> series) {
        return sum(series) / series.size();
    }

    public static double min(TimeSeries<Double> series) {

        requireNotEmpty(series);

        double min = Double.POSITIVE_INFINITY;

        for (var point : series) {
            min = Math.min(min, point.value());
        }

        return min;
    }

    public static double max(TimeSeries<Double> series) {

        requireNotEmpty(series);

        double max = Double.NEGATIVE_INFINITY;

        for (var point : series) {
            max = Math.max(max, point.value());
        }

        return max;
    }

    public static double range(TimeSeries<Double> series) {
        return max(series) - min(series);
    }

    /**
     * Population variance.
     */
    public static double variance(TimeSeries<Double> series) {

        requireNotEmpty(series);

        double mean = mean(series);

        double sumSquared = 0.0;

        for (var point : series) {

            double delta = point.value() - mean;

            sumSquared += delta * delta;
        }

        return sumSquared / series.size();
    }

    /**
     * Population standard deviation.
     */
    public static double standardDeviation(TimeSeries<Double> series) {
        return Math.sqrt(variance(series));
    }

    private static void requireNotEmpty(TimeSeries<?> series) {

        Objects.requireNonNull(series, "series");

        if (series.isEmpty()) {
            throw new IllegalArgumentException(
                    "TimeSeries must contain at least one observation."
            );
        }
    }
}