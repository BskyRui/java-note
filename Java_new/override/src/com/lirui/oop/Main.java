package com.lirui.oop;

public class Main {

    // 方法重写是动态多态, 是运行时的多态
    // 子类重写父类的方法, 且方法的参数名参数个数以及类型都相同

    // 方法重载是静态多态, 是编译时的多态
    public static void main(String[] args) {
        Car c = new Car();
        c.say();

        Bicycle b = new Bicycle();
        b.say();
    }
}
