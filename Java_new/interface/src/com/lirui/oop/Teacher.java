package com.lirui.oop;

/**
 * Created by LargeRui on 6/8/16.
 */
public class Teacher implements Student {
    @Override
    public void name() {
        System.out.println("my name is largerui...");
    }

    @Override
    public void say() {
        System.out.println("say() method in class Teacher...");
    }
}
