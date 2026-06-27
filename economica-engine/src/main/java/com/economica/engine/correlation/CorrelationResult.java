package com.economica.engine.correlation;

public record CorrelationResult(
        CorrelationMethod method,
        double coefficient,
        int observations
) {}
