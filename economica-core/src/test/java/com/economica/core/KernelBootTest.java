package com.economica.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class KernelBootTest {

    @Test
    void kernelShouldBoot() {

        EconomicaKernel kernel = Economica.standard();

        assertNotNull(kernel);
        assertNotNull(kernel.observations());

    }

}
