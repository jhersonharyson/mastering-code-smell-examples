package org.example.check.example1.s;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class DataProcessor {
    private final List<DataObject> dataObjects;

    public void process() {
        for (DataObject dataObject : dataObjects) {
            if (dataObject instanceof TypeAData) {
                processTypeAData((TypeAData) dataObject);
            } else if (dataObject instanceof TypeBData) {
                processTypeBData((TypeBData) dataObject);
            } else if (dataObject instanceof TypeCData) {
                processTypeCData((TypeCData) dataObject);
            } else {
                throw new IllegalArgumentException("Unsupported data type: " + dataObject.getClass());
            }
        }
    }

    private void processTypeAData(TypeAData data) {
        // Logic specific to TypeAData processing
        System.out.println("Processing TypeAData: " + data.getValue());
    }

    private void processTypeBData(TypeBData data) {
        // Logic specific to TypeBData processing
        System.out.println("Processing TypeBData: " + data.getValue());
    }

    private void processTypeCData(TypeCData data) {
        // Logic specific to TypeCData processing
        System.out.println("Processing TypeCData: " + data.getValue());
    }
}
