package com.hsbc.cet;

import com.hsbc.cet.object.ObjectB;
import com.hsbc.cet.object.ObjectC;
import com.hsbc.cet.object.ObjectD;

public class LawOfDemeter {
    /**
     * This example will result in two violations.
     */
    public void example(ObjectB b) {
        // this method call is ok, as b is a parameter of "example"
        ObjectC c = b.getC();

        // this method call is a violation, as we are using c, which we got from B.
        // We should ask b directly instead, e.g. "b.doItOnC();"
        c.doIt();

        // this is also a violation, just expressed differently as a method chain without temporary variables.
        b.getC().doIt();

        // a constructor call, not a method call.
        ObjectD d = new ObjectD();
        // this method call is ok, because we have create the new instance of D locally.
        d.doSomethingElse();
    }
}
