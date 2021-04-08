package com.lirui.oop;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by LargeRui on 4/20/17.
 */
public class UseTreeSet {

    // HashSet是无序的, TreeSet是有序的, 按照ASCII顺序
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        set.add("a");
        set.add("c");
        set.add("3");
        set.add("1");
        set.add("b");

        set.forEach( e -> {
            System.out.println(e);
        });
    }
}
