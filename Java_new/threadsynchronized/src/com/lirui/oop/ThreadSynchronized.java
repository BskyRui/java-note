package com.lirui.oop;


// 使用对象锁的方法来进行线程同步


public class ThreadSynchronized  extends Thread{

    private String threadNo;
    // 对象锁
    private Object obj;

    public ThreadSynchronized(Object obj, String threadNo) {
        this.obj = obj;
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        // 对象锁 -> 如果关键字方法在run()方法上相当于每个线程拥有了自己的锁
        synchronized (obj) {
            for (int i = 0; i < 100; i++) {
                System.out.println("thread" + threadNo + ":" + i);
            }
        }
    }

    // 静态方法是不存在对象中的
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            Object obj = new Object();
            new ThreadSynchronized(obj, i + "").start();
            sleep(1);
        }
    }
}
