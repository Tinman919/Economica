package com.economica.runtime;

import com.economica.engine.internal.IdentityEngine;
import com.economica.model.context.ScientificContext;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ScientificRuntimeTest {

    @Test
    void runtimeShouldExecutePipeline() {

        ScientificRuntime runtime = new ScientificRuntime()
                .add(new IdentityEngine());

        ScientificContext result =
                runtime.execute(ScientificContext.empty());

        assertNotNull(result);
    }
}
