package com.lirui.oop;

/**
 * Created by LargeRui on 4/23/17.
 */

// 1) 各个线程是通过竞争CPU时间而获得运行机会
// 2) 各线程什么时候得到CPU时间, 占用多久, 是不可预测的
// 3) 一个正在运行着的线程在什么地方被暂停是不确定的

// 线程同步(互斥)
// synchronized关键字可以用在 成员方法 / 静态方法 / 语句块

// 使用对象锁的方式来进行线程同步
public class ThreadSynchronized extends Thread{
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
                System.out.println("thread " + threadNo + ":" + i);
            }
        }

        // for (int i = 0; i < 100; i++) {
        //     System.out.println("thread " + threadNo + ":" + i);
        // }
    }

    // 静态方法是不存在对象中的
    public static void main(String[] args) throws InterruptedException {
        // 同时创建5个线程
        Object obj = new Object();
        for (int i = 0; i < 5; i++) {
            new ThreadSynchronized(obj, i + "").start();
            //sleep(1);
        }
    }

}
