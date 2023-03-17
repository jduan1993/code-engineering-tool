package com.hsbc.cet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LooseCoupling {
    // sub-optimal approach
    private ArrayList<String> list1 = new ArrayList<>();

    public HashSet<String> getFoo1() {
        return new HashSet<String>();
    }

    // preferred approach
    private List<String> list2 = new ArrayList<>();

    public Set<String> getFoo2() {
        return new HashSet<String>();
    }
}
