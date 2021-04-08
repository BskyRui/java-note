package com.lirui.oop;

// private       私有, 类的内部
// default       同一包中的类
// protected     同一包中的类, 不同包中的子类
// public        公开

public class Main {

    private int age = 22;

    static {
        // 声明块时先加载static块再执行main
        System.out.println("static declare..");
    }

    // 默认构造方法
    public void Main() {

    }

    // 自定义构造方法
    public void Main(int a, int b) {

    }

    public static void main(String[] args) {
        // 静态方法中不能使用this和super
        System.out.println("main...");
    }

    // this是当前实例的引用

    // super有两种调用方法: 1) super代表父类的实例 2) super()代表父类的构造方法


}
