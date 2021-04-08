package com.lirui.oop;

/**
 * Created by LargeRui on 6/8/16.
 */
public class Outer {
    private String name = "lirui";

    // 访问外部类的私有属性
    class Inner {
        public void getName() {
            System.out.println(name);
        }
    }

    public void say() {
        System.out.println("say hello...");
    }
}
