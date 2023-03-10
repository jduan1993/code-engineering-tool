package java.com.hsbc.cet.tool;

import java.com.hsbc.cet.component.Component1;
import java.com.hsbc.cet.component.Component2;
import java.com.hsbc.cet.component.Component3;
import java.com.hsbc.cet.component.Component4;

public class Tool2 {

    private final int source;

    public Tool2(int source) {
        this.source = source;
    }

    public int getSource() {
        Component1 component1 = new Component1();
        Component2 component2 = new Component2();
        Component3 component3 = new Component3();
        Component4 component4 = new Component4();
        return this.source + 2;
    }
}
