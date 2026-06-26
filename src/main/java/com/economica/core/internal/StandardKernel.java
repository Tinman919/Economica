package com.economica.core.internal;

import com.economica.core.Kernel;
import com.economica.service.ObservationService;

public class StandardKernel implements Kernel {

    private final ObservationService observationService;

    public StandardKernel() {
        this.observationService = null;
    }

    @Override
    public ObservationService observations() {
        return observationService;
    }
}