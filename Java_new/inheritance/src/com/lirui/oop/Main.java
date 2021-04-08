package com.lirui.oop;

public class Main {

    public static void main(String[] args) {
        People p = new People();
        p.run();

        Men m = new Men();
        m.run();

        System.out.println(m.getPeopleName());
    }
}
