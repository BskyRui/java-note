package com.lirui.oop;

/**
 * Created by LargeRui on 4/17/17.
 */
public class Teacher implements Student {

    @Override
    public void name(String name) {
        System.out.println(name + "name() in Teacher class...");
    }

    @Override
    public void say() {
        System.out.println("say() in Teacher class...");
    }
}
