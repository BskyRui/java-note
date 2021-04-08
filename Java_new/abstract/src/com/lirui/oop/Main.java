package com.lirui.oop;


// 包含一个抽象方法的类就是抽象类
// 声明而未被实现的方法，抽象方法必须使用abstract关键字声明

// 1. 类中如果有抽象方法必须声明为抽象类
// 2. 继承抽象类的子类如果没有完全实现抽象类的抽象方法, 那么这个类还是抽象类，如果不是抽象类就必须重写(实现)所有的抽象方法
// 3. 抽象类可以没有抽象方法
// 4. 抽象类不能直接被实例化，要通过其子类进行实例化

public class Main {

    public static void main(String[] args) {
        Worker w = new Worker();
        // 实现的抽象方法
        w.say();
        // 抽象类继承的普通方法
        w.work();
    }
}
