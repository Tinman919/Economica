package com.economica.model.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfidenceTest {

    @Test
    void certainShouldEqualOne() {
        assertEquals(1.0, Confidence.CERTAIN.value());
    }

    @Test
    void unknownShouldEqualZero() {
        assertEquals(0.0, Confidence.UNKNOWN.value());
    }

    @Test
    void rejectsNegativeValues() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Confidence(-0.1)
        );
    }

    @Test
    void rejectsValuesGreaterThanOne() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Confidence(1.1)
        );
    }

    @Test
    void rejectsNaN() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Confidence(Double.NaN)
        );
    }

}
