package com.lirui.oop;

/**
 * Created by LargeRui on 6/8/16.
 */
public class Student extends Person {

    // 子类重写抽象方法
    @Override
    public void say() {
        System.out.println("say() method in Student...");
    }
}
