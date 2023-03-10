package java.com.hsbc.cet.component;

public class Component1 {

    public String activity = "Component1";

    public int size = 666;

    public String action() {
        Component2 component2 = new Component2();
        Component3 component3 = new Component3();
        Component4 component4 = new Component4();
        return this.activity + " " + this.size;
    }
}
