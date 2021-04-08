package com.lirui.oop;

public class Main {

    public static void main(String[] args) {
	    Cat cat = new Cat(2);
        System.out.println(cat.getSuperClassName());
        // 调用重写后的方法
        cat.run();
    }
}
