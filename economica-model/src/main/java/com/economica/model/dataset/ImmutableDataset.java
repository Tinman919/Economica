package com.economica.model.dataset;

/**
 * A dataset whose contents cannot be modified after creation.
 *
 * Immutability guarantees that algorithms may safely share references
 * without defensive copying.
 */
public interface ImmutableDataset<T> extends Dataset<T> {

}
