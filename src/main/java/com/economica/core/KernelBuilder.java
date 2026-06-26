package com.economica.core;

import com.economica.core.internal.DefaultEconomicaKernel;

public final class KernelBuilder {

    private KernelBuilder() {
    }

    public static EconomicaKernel standard() {
        return new DefaultEconomicaKernel();
    }

}
