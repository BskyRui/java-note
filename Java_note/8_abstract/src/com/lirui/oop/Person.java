package com.lirui.oop;

/**
 * Created by LargeRui on 4/17/17.
 */
abstract public class Person {
    private int    age;
    private String name;

    public void Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void work() {
        System.out.println("work in Person class...");
    }

    // 抽象方法
    abstract public void say();
}
