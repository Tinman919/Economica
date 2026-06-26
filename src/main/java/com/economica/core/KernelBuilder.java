package com.economica.core;

import com.economica.core.internal.StandardKernel;

public final class KernelBuilder {

    private KernelBuilder() {
    }

    public static Kernel standard() {
        return new StandardKernel();
    }
}