package org.example.check.example1.clean;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class DataProcessor {
    private final List<DataObject> dataObjects;

    public void process() {
        for (DataObject dataObject : dataObjects) {
            dataObject.process();
        }
    }
}