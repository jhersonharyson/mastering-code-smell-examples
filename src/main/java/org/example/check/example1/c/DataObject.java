package org.example.check.example1.c;

abstract class DataObject {
    protected String value;

    public String getValue() {
        return value;
    }

    public abstract void process();
}
