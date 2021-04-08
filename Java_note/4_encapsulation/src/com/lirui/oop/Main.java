package com.lirui.oop; // 定义包
// import com.lirui.dora.*; // 加载com.lirui.dora.Cat下所有的类
import com.lirui.dora.Cat;  // 加载指定的类


// 封装
// 1) 把类中的一些描述细节隐藏内部, 用户只能通过接口来访问类中的内容, 这种组织模块的方式成为"封装"
// 2) 封装是信息隐藏的一种方式, 留给用户访问对象的接口, 内部信息外部不可以直接访问
// 3) 封装可以使用private关键字来实现

// 实现步骤
// 1) 修改类的可见性 -> 设为private
// 2) 创建getter/setter方法 -> 设为public用于属性的读写
// 3) 在getter/setter方法中加入属性控制语句 -> 对属性值的合法性进行判断

// package
// java中一个包不能存在同名类
// 一个包存放这个包相关的类, 单一职责原则


// static
// 加在成员变量前, 成员属性变为类属性, 静态属性
// 加在方法前, 方法变成类方法, 直接使用ClassName.method()调用
// 静态方法: 中不能直接调用同一个内中非静态成员(方法), 只能直接调用静态成员(方法), 因为不能使用this, 如果需要调用非静态成员则需要实例化

public class Main {

    public static void main(String[] args) {
	    // Cat cat = new Cat("英短", 2);
        // System.out.println(cat.getName());
        Cat cat = new Cat();
        // 同时使用两个Cat
        com.lirui.oop.Cat catNew = new com.lirui.oop.Cat("英短", 2);
        System.out.println(catNew.getName());

    }
}

