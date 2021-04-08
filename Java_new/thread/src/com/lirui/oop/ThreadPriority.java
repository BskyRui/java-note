package com.lirui.oop;

/**
 * Created by LargeRui on 6/14/16.
 */
public class ThreadPriority {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("thread_1: " + i);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("thread_2: " + i);
                }
            }
        });

        // 值越大的优先级越高越先完成
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        // Java 调度程序的任务是使最高优先级的线程能始终运行，一旦时间片可用，则使具有同等优先级的线程以轮转的方式顺序使用时间片。
        // Java线程的优先级越高排程器就会给它越多的CPU执行时间，但请注意：如果有多个线程在等待一个机锁的时候，并不是优先级越高就可以越早执行。
        // 什么时候分配cpu片段完全由os决定
        t1.start();
        t2.start();
    }

}


