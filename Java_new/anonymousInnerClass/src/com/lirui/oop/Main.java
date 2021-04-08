package com.lirui.oop;

// 1. 在整个操作中只使用一次的话就可以定义成内部类
// 2. 定义匿名内部类需要将类声明为抽象类或者接口

public class Main {

    public static void main(String[] args) {
        Person p = new Person() {
            @Override
            public void say() {
                System.out.println("hello, my name is r...");
            }
        };

        p.say();

        Student s = new Student() {
            @Override
            public void getClassName() {
                System.out.println("class name is Student...");
            }
        };

        s.say();
        s.getClassName();
    }
}
