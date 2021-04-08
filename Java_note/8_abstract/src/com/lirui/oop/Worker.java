package com.lirui.oop;

/**
 * Created by LargeRui on 4/17/17.
 */
public class Worker extends Person{
    // 子类重写抽象方法
    @Override
    public void say() {
        System.out.println("say() in Worker class...");
    }
}
