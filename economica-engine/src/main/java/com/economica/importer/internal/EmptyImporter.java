package com.economica.importer.internal;

import com.economica.importer.Importer;
import com.economica.model.context.ScientificContext;

import java.io.IOException;

public final class EmptyImporter
        implements Importer<ScientificContext> {

    @Override
    public ScientificContext importData() throws IOException {
        return ScientificContext.empty();
    }

}