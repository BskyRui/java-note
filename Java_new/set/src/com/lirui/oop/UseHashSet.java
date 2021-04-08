package com.lirui.oop;

// 不可以放重复的数据

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UseHashSet {

    public static void main(String[] args) {
        Set<String> sets = new HashSet<>();
        sets.add("a");
        sets.add("a");
        sets.add("b");
        sets.add("c");

        System.out.println(sets);

        Iterator iter = sets.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // java8
        sets.forEach((e) -> {
            System.out.println(e);
        });

        // for
        for (String s: sets) {
            System.out.println(s);
        }
    }
}
