package com.lirui.oop;

public class Main {

    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.add(1.2f, 1.2f, 1.4f));
        System.out.println(c.add(1, 2, 3));
        System.out.println(c.add(1, 2, 4, 55, 7));
    }
}
