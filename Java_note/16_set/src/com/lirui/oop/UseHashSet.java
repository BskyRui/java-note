package com.lirui.oop;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UseHashSet {

    // 1) HashSet是Set的一个重要实现类, 成为哈希集
    // 2) HashSet中的元素无序并且不可以重复
    // 3) HashSet中只允许一个null值
    // 4) 具有良好的存取和查找性能
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");

        System.out.println(set);

        // 声明迭代器
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //java8 lambda
        set.forEach( e -> {
            System.out.println(e);
        });

        // for
        for (String s: set) {
            System.out.println(s);
        }

    }
}
