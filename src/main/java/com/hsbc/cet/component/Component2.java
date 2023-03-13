package com.hsbc.cet.component;

public class Component2 {

    public String activity = "Component2";

    public int size = 555;

    public String action() {
        Component3 component3 = new Component3();
        Component4 component4 = new Component4();
        return this.activity + " " + this.size;
    }
}
