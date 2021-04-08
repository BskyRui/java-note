package com.lirui.oop;

import com.sun.tools.javac.util.FatalError;

public class Main {

    // 重载的两种表现形式: 1) 重载和覆盖 2) 对象的多态性

    // 对象的多态性: 1) 向上转型(自动) -> 父类   父类对象 = 子类实例
    //             2) 向下转型(强制) -> 子类   子类对象 = (子类)父类实例
    public static void main(String[] args) {
        // 如果子类重写了父类的方法会执行子类的方法

        // 1)
        Father f = new Son();
        f.say();
        // 2) 父类型不能转为子类型
        // Father f = new Father();
        // Son    s = (Son) f;
        // s.say();

        // 静态绑定 -> 编译器知道调用哪个方法, 不存在与实际类型不匹配的现象, 不存在多态问题

        // 动态绑定 -> 在程序运行中, 会根据程序传递的参数不同而调用不同的方法, 有着不确定性, 存在多态问题
        Father f2 = new Father();

        Main m = new Main();
        m.sayWhoAmI(f2);
    }

    public void sayWhoAmI(Father f) {
        f.say();
    }
}
