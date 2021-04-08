package com.lirui.oop;

// 进程是指可执行程序并存放在计算机存储器的一个指令序列, 它是一个动态执行的过程
// 线程是比进程还要小的运行单位, 一个进程包含多个线程, 线程相当于一个子程序

// 1) 创建一个Thread类, 或者一个Thread子类的对象
// 2) 创建一个实现Runnable接口的类的对象


public class MyThread extends Thread{

    @Override
    public void run() {
        // super.run();
        System.out.println("thread run() ...");
    }
}
