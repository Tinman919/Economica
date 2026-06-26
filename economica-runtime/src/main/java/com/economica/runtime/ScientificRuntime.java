package com.economica.runtime;

import com.economica.engine.ScientificEngine;
import com.economica.model.context.ScientificContext;

import java.util.ArrayList;
import java.util.List;

public final class ScientificRuntime {

    private final List<ScientificEngine> engines = new ArrayList<>();

    public ScientificRuntime add(ScientificEngine engine) {
        engines.add(engine);
        return this;
    }

    public ScientificContext execute(ScientificContext context) {

        ScientificContext current = context;

        for (ScientificEngine engine : engines) {
            current = engine.execute(current);
        }

        return current;
    }
}
