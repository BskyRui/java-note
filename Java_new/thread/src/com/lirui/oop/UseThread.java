package com.lirui.oop;

import static java.lang.Thread.sleep;

public class UseThread {

    public static void main(String[] args) {
        // 直接继承Thread
        /*
        MyThread t = new MyThread();
        t.run();
        */

        // 实现Runnable接口
        MyThread2 myThread2 = new MyThread2();
        Thread t = new Thread(myThread2);
        // t.start();

        Thread t2 = new Thread(new MyThread(){
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("Runnable 222..." + i);
                }
            }
        });

        t2.start();
        // 线程id
        System.out.println(t2.getId());
        // 线程名
        System.out.println(t2.getName());
        // 当前线程对象
        System.out.println(Thread.currentThread().getName());

        // main thread会阻塞等待t3执行完再执行
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("thread_" + i);
        }



        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
                        sleep(1000);
                        System.out.println("new Runnable...");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        // t3.start();

        // 线程是否还在运行
        System.out.println(t3.isAlive());
    }
}
