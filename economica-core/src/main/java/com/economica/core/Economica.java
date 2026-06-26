package com.economica.core;

public final class Economica {

    private Economica() {
    }

    public static EconomicaKernel standard() {
        return KernelBuilder.standard();
    }

}
