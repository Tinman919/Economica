package com.economica.importer;

import com.economica.importer.internal.EmptyImporter;
import com.economica.model.context.ScientificContext;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class EmptyImporterTest {

    @Test
    void shouldReturnEmptyContext() throws IOException {

        Importer<ScientificContext> importer =
                new EmptyImporter();

        ScientificContext context =
                importer.importData();

        assertNotNull(context);

        assertTrue(context.observations().isEmpty());

    }

}
