package com.hsbc.cet;

import com.hsbc.cet.component.Component1;
import com.hsbc.cet.component.Component2;
import com.hsbc.cet.component.Component3;
import com.hsbc.cet.component.Component4;
import com.hsbc.cet.tool.Tool1;
import com.hsbc.cet.tool.Tool2;
import com.hsbc.cet.tool.Tool3;
import com.hsbc.cet.tool.Tool4;

import java.util.*;
import java.io.*;

public class HighNumberImports {

    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();
    Component4 component4 = new Component4();

    Tool1 tool1 = new Tool1(1);
    Tool2 tool2 = new Tool2(2);
    Tool3 tool3 = new Tool3(3);
    Tool4 tool4 = new Tool4(4);

    Test1 test1 = new Test1();
    Test2 test2 = new Test2();
    Test3 test3 = new Test3();

    public void print() {
        System.out.println(component1.action());
        System.out.println(component2.action());
        System.out.println(component3.action());
        System.out.println(component4.action());

        System.out.println(tool1.getSource());
        System.out.println(tool2.getSource());
        System.out.println(tool3.getSource());
        System.out.println(tool4.getSource());

        test1.test();
        test2.test();
        test3.test();

        System.out.println("HighNumberImports");
    }

    public static void main(String[] args) throws Exception {
        List<String> lines = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
        String line = null;
        System.out.println(line);
    }
}
