package com.economica.core;

/**
 * Public entry point for the Economica framework.
 */
public final class Economica {

    private Economica() {
    }

    public static Kernel standard() {
        return KernelBuilder.standard();
    }
}