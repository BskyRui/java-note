package com.lirui.oop;

/**
 * Created by LargeRui on 4/17/17.
 */
public class Outer {
    private String name = "LR";

    // 访问外部内类的私有属性
    class Inner {
        public void getName() {
            System.out.println("Outer name is " + name);
        }
    }

    static class StaticInner {
        public void getName() {
            System.out.println("static inner class");
        }
    }

    public void say() {
        System.out.println("say hello...");
    }
}
