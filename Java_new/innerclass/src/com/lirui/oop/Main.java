package com.lirui.oop;

// 1. 破坏了程序结构
// 2. 可以访问外部类的私有属性

// http://blog.csdn.net/jueblog/article/details/13434551

// 静态内部类
// -> 在成员内部类加上了static修饰, 在创建内部类的时候直接 Inner i = new Inner();
// 方法内部类(局部内部类)
// -> 方法内部类就是内部类定义在外部类的方法中，只能在该方法内局部可以使用。

public class Main {

    public static void main(String[] args) {
        Outer o = new Outer();
        o.say();
        // 匿名对象
        new Outer().say();

        // 访问一个内部类需要声明为static -> 静态内部类
        // new Outer.Inner().getName();

        // 不声明static访问内部类
        new Outer().new Inner().getName();
        o.new Inner().getName();

    }
}
