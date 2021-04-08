package com.lirui.oop;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {

    // 1) list允许重复的元素, set不可以
    // 2) list是元素有序可以重复的集合, 称为序列
    // 3) list可以精确的控制每个元素的插入位置, 或删除某个位置的元素
    // 4) list的两个主要实现类是ArrayList和LinkedList


    // 1) ArrayList底层是由数组实现的
    // 2) 动态增长, 以满足应用程序的需求
    // 3) 在列表尾部插入或删除数据效率很高
    // 4) 更适合查找和更新元素

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 移除下标为0的元素
        list.remove(0);
        // 原来0下标会被后面的替代
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
