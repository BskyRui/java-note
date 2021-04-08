package com.lirui.oop;

import java.util.List;
import java.util.Vector;

/**
 * Created by LargeRui on 6/12/16.
 */

// ArrayList和Vector的区别
// ArrayList是jdk1.2后出现的, 异步处理性能高, 非线程安全
// Vector是jdk1.0后出的, 同步处理性能低, 线程安全

public class UseVector {
    public static void main(String [] args) {
        // vector
        List<String> lists = new Vector<>();
        lists.add("a");
        lists.add("b");
        lists.add("c");
        lists.add("a");

        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }
    }
}
