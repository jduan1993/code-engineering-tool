package com.hsbc.cet.tool;

import com.hsbc.cet.component.Component1;
import com.hsbc.cet.component.Component2;
import com.hsbc.cet.component.Component3;
import com.hsbc.cet.component.Component4;

public class Tool4 {

    private final int source;

    public Tool4(int source) {
        this.source = source;
    }

    public int getSource() {
        Component1 component1 = new Component1();
        Component2 component2 = new Component2();
        Component3 component3 = new Component3();
        Component4 component4 = new Component4();
        return this.source + 4;
    }
}
