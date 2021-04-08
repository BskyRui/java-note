package com.lirui.oop;

public class Main {

    public static void main(String[] args) {
        // finally不管有没有异常都会执行
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println(e);
            // 终止程序运行
            // System.exit(1);
        } finally {
            System.out.println("exception");
        }

        // 主动抛出异常
        try {
            throw new Exception("实例化异常");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            Calc c = new Calc();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static class Calc {
        int a = 5;
        int b = 0;
        int res;
        // 把异常交给上级处理
        public Calc() throws Exception {
            res = a / b;
            System.out.println(res);
        }
    }
}
