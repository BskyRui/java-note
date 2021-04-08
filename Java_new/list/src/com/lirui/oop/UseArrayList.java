package com.lirui.oop;

// list允许重复的元素, set不可以

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {

    public static void main(String[] args) {
        // list
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("----");
        // 移除下标为0的元素
        list.remove(0);

        // 现在b的下标是0, 代替了原来下标
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
