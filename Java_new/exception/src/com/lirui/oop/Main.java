package com.lirui.oop;

// class MyException extends Exception { }

public class Main {

    public static void main(String[] args) {
        /*try {
            int num = 10 / 0;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("exception");
        }
        */

        try {
            Calc c = new Calc();
        } catch (Exception e) {
            System.out.println(e);
        }

        // throw
        try {
            throw new Exception("实例化异常");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static class Calc {
        int a   = 5;
        int b   = 0;
        int res;

        // 把异常交给上级处理
        public Calc() throws Exception {
            res = a / b;
            System.out.println(res);
        }
    }
}
