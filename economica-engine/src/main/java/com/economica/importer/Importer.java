package com.economica.importer;

import java.io.IOException;

/**
 * Generic importer of external data.
 *
 * @param <T> imported object type
 */
public interface Importer<T> {

    T importData() throws IOException;

}
