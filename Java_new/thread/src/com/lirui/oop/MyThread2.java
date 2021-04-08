package com.lirui.oop;

/**
 * Created by LargeRui on 6/14/16.
 */
public class MyThread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Runnable");
        }
    }
}
