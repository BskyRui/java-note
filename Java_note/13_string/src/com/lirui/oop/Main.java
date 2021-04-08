package com.lirui.oop;

public class Main {

    public static void main(String[] args) {
        String string = "lirui";
        // 字符串长度
        System.out.println(string.length());
        // 2, 从右边开始查找字符(串), -1未找到
        System.out.println(string.lastIndexOf('r'));
        // 指定开始搜索位置
        System.out.println(string.lastIndexOf('i', 2));

        String str = " lirui ";
        // 去除字符串两端的空白
        System.out.println(str.trim());
        // 截取字符串, 从第1个字符到结尾
        System.out.println(str.substring(1));
        // 截取部分, n, m 但不包括m
        System.out.println(str.substring(1, 5));
        // 获取第n个字符 i
        System.out.println(str.charAt(5));

        // 转换为字符数组
        char[] cArr = str.toCharArray();
        System.out.println(cArr);

        System.out.println(str.hashCode());
        System.out.println("rrr ".trim());

        // 查找字符串出现的位置 2
        System.out.println("LiRui".indexOf('R'));

        // 字节数组
        byte[] byteArr = "LIRUI".getBytes();
        for (int i = 0; i < byteArr.length; i++) {
            System.out.println(byteArr[i]);
        }

        // 将字节数组转为字符串, 可以指定字符集
        String name = new String(byteArr);
        System.out.println(name);
    }
}
