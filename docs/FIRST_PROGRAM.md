# The First Economica Program

This document describes the ideal user experience for Economica.

The implementation of the framework should evolve toward making this
program natural, readable, and expressive.

---

## Goal

Import a dataset.

Analyze it.

Discover relationships.

Produce knowledge.

---

## Example

```java
Dataset dataset =
        CsvImporter
                .from("prices.csv")
                .load();

Analysis analysis =
        ScientificEngine
                .analyze(dataset);

System.out.println(analysis.summary());
mkdir -p economica-engine/src/main/java/com/economica/engine/analysis

mkdir -p economica-engine/src/test/java/com/economica/engine/analysis
cat > economica-engine/src/main/java/com/economica/engine/analysis/AnalysisService.java <<'EOF'
package com.economica.engine.analysis;

import com.economica.model.timeseries.TimeSeries;

public interface AnalysisService {

    AnalysisReport analyze(TimeSeries<?> series);

}
