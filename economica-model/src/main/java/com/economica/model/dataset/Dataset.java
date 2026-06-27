package com.economica.model.dataset;

import java.util.Iterator;
import java.util.stream.Stream;

/**
 * A generic collection of scientific data.
 *
 * Dataset is the root abstraction for all data containers used by
 * Economica. Examples include time series, matrices, graphs, and tables.
 */
public interface Dataset<T> extends Iterable<T> {

    /**
     * Number of elements in the dataset.
     */
    int size();

    /**
     * Returns true if the dataset contains no elements.
     */
    default boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Returns a sequential stream over the dataset.
     */
    Stream<T> stream();

    @Override
    Iterator<T> iterator();

}
