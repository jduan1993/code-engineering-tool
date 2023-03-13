package com.hsbc.cet.component;

public class Component3 {

    public String activity = "Component3";

    public int size = 777;

    public String action() {
        Component4 component4 = new Component4();
        return this.activity + " " + this.size;
    }
}
