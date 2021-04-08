package com.lirui.oop;

/**
 * Created by LargeRui on 6/6/16.
 */
public class Calc {

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public float add(float a, float b, float c) {
        return a + b + c;
    }

    // 可变参数
    public int add(int... values) {
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }

        return total;
    }
}
