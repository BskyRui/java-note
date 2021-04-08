package com.lirui.oop;

/**
 * Created by LargeRui on 4/23/17.
 */

// 线程优先级

public class ThreadPriority {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("thread1:" + i);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("thread2:" + i);
                }
            }
        });

        // 值越大优先级越高越先完成
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        // 1) Java调度程序的任务是使最高优先级的线程始终能运行, 一旦时间片段可用, 则使具有同等优先级的线程以轮转的方式顺序使用时间片
        // 2) Java线程的优先级越高排程器就会给它约多的CPU执行时间, 但如果多个线程在等待一个锁的时候, 并不是优先级越高就可以约早执行
        // 3) 分配CPU片段完全由os决定
        thread1.start();
        thread2.start();
    }
}
