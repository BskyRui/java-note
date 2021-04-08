package com.lirui.oop;

import static java.lang.Thread.sleep;

/**
 * Created by LargeRui on 4/23/17.
 */

public class UseThread {

    public static void main(String[] args) {
        // 1) 直接使用Thread
        MyThread myThread = new MyThread();
        myThread.start();

        // 2) 通过实现了Runnable接口的方式
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        // thread.start();

        // 匿名内部类
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                }
            }
        });
        // 启动一个线程
        thread1.start();
        System.out.println("start ...");
        // 如果使用thread1.run()相当于在主线程中执行一个普通方法, 上一行输出在thread1.run()后

        // 线程ID
        System.out.println(thread1.getId());

        // 主线程等待子线程完成
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("thread: " + i);
        }

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (;;) {
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("sleep...");
                }
            }
        });

        thread2.start();
        // 线程是否还在运行
        System.out.println(thread2.isAlive());

    }
}
