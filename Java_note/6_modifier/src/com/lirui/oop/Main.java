package com.lirui.oop;


// public       任意位置访问
// protected    当前类 / 同包中的子类和非子类 / 跨包中的子类
// default      当前类 / 同包子类和非子类
// private      在本类中

// 子类重写父类方法时, 访问权限修饰符必须 >= 父类的访问权限
public class Main {
    public final int age;

    {
        age = 22;
    }

    public static void main(String[] args) {

    }
}

// 继承后的类的初始化顺序: 父类静态成员 -> 子类静态成员 -> 父类对象构造 -> 子类对象构造
// 子类构造默认(隐式, 显式调用需要在子类构造函数的首行)调用父类的无参构造


// final
// 1) public final class ClassName / final public class ClassName, 写在类前表示不能被继承
// 2) public final void method(), 写在方法返回值前面表示该方法不能被(子类)重写, 但可以被子类继承使用
// 3) 作为方法内的局部变量, 只要在使用之前赋值就可以; 作为类成员属性时如果不在定义时赋值, 就只能在构造函数或者构造代码块里赋值
// 4) 修饰变量表示不允许被修改, public static final int age; 修饰引用数据类型表示该变量不能重新赋值, 但对象内容可以被修改
// 5) 构造方法不允许final类修饰




