package com.lirui.oop;

import java.util.List;
import java.util.Vector;

/**
 * Created by LargeRui on 4/19/17.
 */
public class UseVector {
    // ArrayList和Vector的区别
    // 1) ArrayList是jdk1.2后出现的, 异步处理性能高, 非线程安全
    // 2) Vector是jdk1.0后出现的, 同步处理性能低, 线程安全

    public static void main(String[] args) {
        List<String> list = new Vector<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
