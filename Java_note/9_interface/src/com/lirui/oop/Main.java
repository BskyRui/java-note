package com.lirui.oop;

// 1. 接口可以理解为一种特殊的类, 里面全部都是由全局常量和公共抽象方法所组成(public)
// 2. 接口不能包含成员变量, 除了static和final变量
// 3. 没有构造方法
// 4. 不能用于实例化对象
// 5. 接口是隐式抽象的, 不必显式声明abstract
// 6. 接口中的方法是隐式抽象的, 不必显式声明abstract
// 7. 接口必须有子类, 并且子类要实现全部的抽象方法
// 8. 一个子类可以实现多个接口, 但是一个子类只能继承一个抽象类public class className implements 接口名称, 接口名称 来(多)实现
// 9. 一个子类可以继承抽象类的同时实现接口public class className extends className implements interfaceName, ...
// 10. 一个接口是可以继承多个接口

// 接口和抽象类的区别
// 1. 都不能实例化
// 2. 可以用来声明变量, 通过变量指向子类或实现类的对象, 来创建对象实例 Student s = new Teacher();
// 3. 抽象类可以拥有实例字段, 接口只能有静态变量
// 4. 接口方法默认public, 抽象类必须手动声明访问控制符


public class Main {

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.say();
        // 接口用来声明变量
        // 接口类型的引用指向了一个实现了该接口的对象, 这是java中一种多态现象
        // java中的接口不能被实例化, 但是可以通过接口引用指向一个对象, 这样通过接口来调用方法可以屏蔽掉具体方法实现, 这是在java中
        // 经常用到的接口回调, 也就是经常说的面向接口编程
        Student s = new Teacher();
        s.name("lirui");
        // 回调实现了该接口的对象里的方法
        new Main().say((Teacher) s, "say my name:");
    }

    public void say(Teacher t, String name) {
        t.name(name);
    }
}
