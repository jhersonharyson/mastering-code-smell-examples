package org.example.check.example1.c;

class TypeBData extends DataObject {
    public TypeBData(String value) {
        this.value = value;
    }

    @Override
    public void process() {
        // Logic specific to TypeAData processing
        System.out.println("Processing TypeBData: " + getValue());
    }
}
