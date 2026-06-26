package com.economica.core.internal;

import com.economica.core.EconomicaKernel;
import com.economica.service.ObservationService;

/**
 * Default implementation of the Economica scientific kernel.
 */
public final class DefaultEconomicaKernel implements EconomicaKernel {

    private final ObservationService observationService;

    public DefaultEconomicaKernel() {
        this.observationService = new ObservationService();
    }

    @Override
    public ObservationService observations() {
        return observationService;
    }

}
