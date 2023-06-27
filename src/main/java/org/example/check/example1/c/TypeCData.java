package org.example.check.example1.c;

class TypeCData extends DataObject {
    public TypeCData(String value) {
        this.value = value;
    }

    @Override
    public void process() {
        // Logic specific to TypeAData processing
        System.out.println("Processing TypeCData: " + getValue());
    }
}
