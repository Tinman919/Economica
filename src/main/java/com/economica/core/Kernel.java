package com.economica.core;

import com.economica.service.ObservationService;

/**
 * Primary interface to the Economica kernel.
 */
public interface Kernel {

    ObservationService observations();

}