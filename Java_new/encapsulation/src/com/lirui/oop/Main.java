package com.lirui.oop;

// 封装
// 1) 把类中的一些描述细节隐藏内部, 用户只能通过接口来访问类中的内容, 这种组织模块的方式成为"封装"
// 2) 封装是信息隐藏的一种方式, 留给用户访问对象的接口, 内部信息外部不可以直接访问
// 3) 封装可以使用private关键字来实现

public class Main {

    public static void main(String[] args) {
        People p = new People();
        System.out.println(p.getName());
        p.setName("李锐锐");
        System.out.println(p.getName());
    }
}


