package com.lirui.oop;


// 1. 在整个操作中只使用一次的话就可以定义成内部类
// 2. 定义内部类需要将类声明为抽象类或者接口

public class Main {

    // 在一个类的内部实例化一个接口或者抽象类
    public static void main(String[] args) {
	    People p = new People() {
            @Override
            public void say() {
                System.out.println("my name is lr...");
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
