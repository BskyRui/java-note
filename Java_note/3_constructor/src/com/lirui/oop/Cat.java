package com.lirui.oop;

/**
 * Created by LargeRui on 4/8/17.
 */
public class Cat {

    private String name;
    private int age;

    // 当没有指定构造方法时, 系统会自动添加无参构造方法, 一个类中可以有个构造方法(方法重载)
    public Cat() {
        System.out.println("无参构造方法");
    }

    public Cat(String name, int age) {
        // this代表当前对象, 谁调用就是当前对象(对象实例)
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println("hello, my name is little cat");
    }
}
