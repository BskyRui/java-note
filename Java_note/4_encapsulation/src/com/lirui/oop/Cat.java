package com.lirui.oop;

/**
 * Created by LargeRui on 4/8/17.
 */
public class Cat {
    private int age;
    private String name;

    public Cat(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}
