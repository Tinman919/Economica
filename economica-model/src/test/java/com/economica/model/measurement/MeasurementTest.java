package com.economica.model.measurement;

import com.economica.model.common.Confidence;
import com.economica.model.common.Source;
import com.economica.model.common.Unit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MeasurementTest {

    @Test
    void createsMeasurement() {

        Measurement<Double> measurement =
                new Measurement<>(
                        123.45,
                        Unit.NONE,
                        Confidence.CERTAIN,
                        new Source("unit-test")
                );

        assertEquals(123.45, measurement.value());

    }

}
