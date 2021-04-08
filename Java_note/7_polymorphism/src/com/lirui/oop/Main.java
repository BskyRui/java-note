package com.lirui.oop;

public class Main {

    // 重载的两种表现形式: 1) 重载和覆盖 2) 对象的多态性
    public static void main(String[] args) {
        // 对象的多态性
        // 1) 向上转型(自动) -> 父类 父类对象 = 子类实例
        Father father = new Son();
        father.say();

        // 2) 向下转型(强制) -> 子类 子类对象 = (子类)父类实例
        // 父类不能强转为子类
        // Father f = new Father();
        // Son s = (Son) f;
        // s.say();

        // 静态绑定 -> 编译器知道调用哪个方法, 不存在与实际类型不匹配的现象, 不存在多态的问题
        // 动态绑定 -> 在程序运行中, 会根据程序传递的参数不同而调用不同的方法, 有着不确定性, 存在多态的问题
        Father father1 = new Father();
        new Main().sayWhoAmI(father1);
        new Main().sayWhoAmI(new Son());
    }

    public void sayWhoAmI(Father f) {
        f.say();
    }
}
