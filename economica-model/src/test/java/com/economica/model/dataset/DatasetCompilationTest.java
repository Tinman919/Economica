package com.economica.model.dataset;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class DatasetCompilationTest {

    @Test
    void datasetTypeExists() {
        assertNotNull(Dataset.class);
    }

}
