package com.economica.model.context;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScientificContextTest {

    @Test
    void emptyContextShouldContainNoObjects() {

        ScientificContext context =
                ScientificContext.empty();

        assertTrue(context.entities().isEmpty());
        assertTrue(context.observations().isEmpty());
        assertTrue(context.relationships().isEmpty());
        assertTrue(context.evidence().isEmpty());
        assertTrue(context.knowledge().isEmpty());

    }

}
