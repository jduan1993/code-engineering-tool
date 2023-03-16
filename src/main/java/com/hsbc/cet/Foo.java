package com.hsbc.cet;

import com.hsbc.cet.entity.Bar;
import com.hsbc.cet.entity.Bardo;
import com.hsbc.cet.entity.Blah;
import com.hsbc.cet.entity.ObjectA;
import com.hsbc.cet.entity.ObjectB;
import com.hsbc.cet.entity.ObjectC;
import com.hsbc.cet.entity.ObjectZ;

public class Foo {
    private Blah var1;
    private Bar var2;

    //followed by many imports of unique objects
    ObjectC doWork() {
        Bardo var55;
        ObjectA var44;
        ObjectZ var93;
        return something();
    }

    ObjectB doWork2() {
        return somethingB();
    }

    private ObjectC something() {
        return new ObjectC();
    }

    private ObjectB somethingB() {
        return new ObjectB();
    }
}