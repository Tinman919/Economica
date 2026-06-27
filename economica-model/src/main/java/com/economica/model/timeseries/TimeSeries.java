package com.economica.model.timeseries;

import com.economica.model.dataset.Dataset;

import java.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * Immutable ordered series of observations.
 *
 * @param <T> value type
 */
public final class TimeSeries<T> implements Dataset<TimePoint<T>> {

    private final List<TimePoint<T>> points;

    private TimeSeries(List<TimePoint<T>> points) {
        this.points = List.copyOf(points);
    }

    public static <T> TimeSeries<T> of(List<TimePoint<T>> points) {
        Objects.requireNonNull(points, "points");
        return new TimeSeries<>(points);
    }

    @Override
    public int size() {
        return points.size();
    }

    @Override
    public boolean isEmpty() {
        return points.isEmpty();
    }

    public TimePoint<T> first() {

        if (points.isEmpty()) {
            throw new IllegalStateException("TimeSeries is empty.");
        }

        return points.get(0);
    }

    public TimePoint<T> last() {

        if (points.isEmpty()) {
            throw new IllegalStateException("TimeSeries is empty.");
        }

        return points.get(points.size() - 1);
    }

    public List<T> values() {
        return points.stream()
                .map(TimePoint::value)
                .toList();
    }

    public List<Instant> timestamps() {
        return points.stream()
                .map(TimePoint::timestamp)
                .toList();
    }

    @Override
    public Stream<TimePoint<T>> stream() {
        return points.stream();
    }

    @Override
    public Iterator<TimePoint<T>> iterator() {
        return points.iterator();
    }
}
