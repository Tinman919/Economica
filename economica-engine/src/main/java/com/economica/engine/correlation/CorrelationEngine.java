package com.economica.engine.correlation;

public interface CorrelationEngine {

    CorrelationResult compute(
            double[] x,
            double[] y
    );

}
