package com.lirui.oop;

/**
 * Created by LargeRui on 6/6/16.
 */
public class Men extends People {

    // 重写父类的run()方法
    @Override
    public void run() {
        // super.run();
        System.out.println("Men run...");
    }

    // name继承自父类
    public String getPeopleName() {
        // return this.name;
        return name;
    }
}
