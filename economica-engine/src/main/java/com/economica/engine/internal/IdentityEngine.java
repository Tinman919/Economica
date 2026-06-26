package com.economica.engine.internal;

import com.economica.engine.ScientificEngine;
import com.economica.model.context.ScientificContext;

public final class IdentityEngine extends ScientificEngine {

    @Override
    public String name() {
        return "Identity";
    }

    @Override
    public ScientificContext execute(
            ScientificContext context) {

        return context;

    }

}
