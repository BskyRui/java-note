package com.lirui.oop;

/**
 * Created by LargeRui on 6/15/16.
 */

// 引起死锁的原因
// 1) 线程使用资源必须至少有一个是不能共享的
// 2) 至少有一个线程必须持有一个资源并且正在等待获取一个当前被其他线程持有的资源
// 3) 分配的资源不能从相应线程被强制剥夺
// 4) 第一个线程等待其他线程, 后者又等待第一个线程

public class DeadLock {

    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        TRunnable t1 = new TRunnable("A", o1, o2, 3000);
        TRunnable t2 = new TRunnable("B", o2, o1, 300);

        // t1正在用o1的对象锁, t2等待t1释放o1锁, t1又在等待t2释放o2(实际上还是o1)
        new Thread(t1).start();
        new Thread(t2).start();
    }
}


class TRunnable implements Runnable {

    private String threadNo;
    private Object o1, o2;
    private int dur;

    public TRunnable(String threadNo, Object o1, Object o2, int dur) {
        this.threadNo = threadNo;
        this.o1 = o1;
        this.o2 = o2;
        this.dur = dur;
    }

    @Override
    public void run() {
        System.out.println("线程:" + threadNo);

        synchronized (o1) {
            try {
                // 不会释放锁
                Thread.sleep(dur);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (o2) {
                System.out.println("线程-" + threadNo);
            }
        }
    }
}
