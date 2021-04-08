package com.lirui.oop;

/**
 * Created by LargeRui on 4/23/17.
 */

// 1) Runnable只有一个方法run
// 2) Runnable是java中用以实现线程的接口
// 3) 任何实现线程功能的类都必须实现该接口

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("run() in Runnable...");
    }
}
