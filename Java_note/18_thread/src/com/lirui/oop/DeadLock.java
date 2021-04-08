package com.lirui.oop;

/**
 * Created by LargeRui on 4/23/17.
 */

// 线程wait() notifyAll()

// 引起死锁的原因:
// 1) 线程使用的资源至少有一个是不能共享的
// 2) 至少有一个线程必须持有一个资源并且正在等待获取一个当前被其他线程持有的资源
//


// 避免死锁:
// 1) 避免嵌套锁
// 2) 只对有请求的进行锁
// 3) 避免无限期待的等待

public class DeadLock {

    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();

        TRunnable tRunnable1 = new TRunnable("A", object1, object2, 3000);
        TRunnable tRunnable2 = new TRunnable("B", object1, object2, 300);

        // t1正在使用obj1的对象锁, t2正在等待t1释放obj1锁, t1又在等待t2释放obj2(实际上还是obj1)
        new Thread(tRunnable1).start();
        new Thread(tRunnable2).start();

    }
}

class TRunnable implements Runnable {

    private String threadNo;
    private Object obj1, obj2;
    private int dura;

    public TRunnable(String threadNo, Object obj1, Object obj2, int dura) {
        this.threadNo = threadNo;
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.dura = dura;
    }

    @Override
    public void run() {
        System.out.println("thread:" + threadNo);
        synchronized (obj1) {
            try {
                Thread.sleep(dura);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (obj2) {
                System.out.println("线程:" + threadNo);
            }
        }
    }
}

