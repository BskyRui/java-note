package com.lirui.oop;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by LargeRui on 6/12/16.
 */

// HashSet是无序, TreeSet是有序, 按照ascii顺序
public class UseTreeSet {

    public static void main(String[] args) {
        Set<String> sets = new TreeSet<>();
        sets.add("a");
        sets.add("1");
        sets.add("2");
        sets.add("3");
        sets.add("b");
    }
}
