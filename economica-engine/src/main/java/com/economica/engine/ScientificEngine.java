package com.economica.engine;

import com.economica.model.context.ScientificContext;

/**
 * Base class for all scientific processing engines.
 *
 * Engines consume an immutable ScientificContext and
 * produce a new immutable ScientificContext.
 */
public abstract class ScientificEngine {

    /**
     * Human-readable engine name.
     */
    public abstract String name();

    /**
     * Engine version.
     */
    public String version() {
        return "1.0";
    }

    /**
     * Executes the engine.
     */
    public abstract ScientificContext execute(
            ScientificContext context);

}
