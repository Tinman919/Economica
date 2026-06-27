package com.economica.model.dataset;

/**
 * A dataset whose elements have a defined encounter order.
 */
public interface OrderedDataset<T> extends ImmutableDataset<T> {

    T first();

    T last();

}
