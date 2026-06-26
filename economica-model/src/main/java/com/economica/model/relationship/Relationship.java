package com.economica.model.relationship;

import com.economica.model.common.ScientificObject;

public record Relationship(
        String from,
        String type,
        String to
) implements ScientificObject { }
