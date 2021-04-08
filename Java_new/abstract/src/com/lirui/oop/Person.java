package com.lirui.oop;

/**
 * Created by LargeRui on 6/8/16.
 */
abstract public class Person {
    private int    age;
    private String name;

    public void Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void work() {
        System.out.println("work in Person...");
    }

    abstract public void say();
}
