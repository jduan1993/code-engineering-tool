package com.hsbc.cet.object;

public class ObjectB {
    String id;
    String name;

    public ObjectC getC() {
        return new ObjectC();
    }
}
