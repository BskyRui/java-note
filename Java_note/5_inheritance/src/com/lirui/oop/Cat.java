package com.lirui.oop;

/**
 * Created by LargeRui on 4/9/17.
 */

// 父类私有的无法继承
public class Cat extends Animal {
    public int age;

    public Cat(int age) {
        this.age = age;
    }

    public String getSuperClassName() {
        // 访问父类方法
        super.say();
        return this.name;
    }

    // 方法重写, 返回值类型 / 方法名 / 参数类型个数 需要完全一致
    @Override
    public void run() {
        System.out.println("i am running in Cat class...");
    }

    // 方法重载
    public void run(int age) {

    }
}
