package org.example.check.example1.c;

class TypeAData extends DataObject {
    public TypeAData(String value) {
        this.value = value;
    }

    @Override
    public void process() {
        // Logic specific to TypeAData processing
        System.out.println("Processing TypeAData: " + getValue());
    }
}
