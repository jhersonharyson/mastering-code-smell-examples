package org.example.check.example1.clean;

abstract class DataObject {
    protected String value;

    public String getValue() {
        return value;
    }

    public abstract void process();
}
