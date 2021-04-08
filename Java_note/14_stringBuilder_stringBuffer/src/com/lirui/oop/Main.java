package com.lirui.oop;

public class Main {

    public static void main(String[] args) {
	    // String和StringBuilder的区别
        // String具有不可变性, 而StringBuilder不具备, 当频繁操作字符串时, 使用StringBuilder

        // StringBuffer和StringBuilder基本相似, StringBuilder性能高建议使用, StringBuffer是线程安全的
        // 能够被修改而不产生新的类
        Integer a = 12;
        System.out.println(a instanceof Integer);

        StringBuilder sbString = new StringBuilder("test");
        // 追加
        sbString.append(" demo");
        System.out.println(sbString);
        // 翻转字符串
        sbString.reverse();
        System.out.println(sbString);
        // 插入字符串
        sbString.insert(3, "qq");
        System.out.println(sbString);

        // 替换 start, end 不包括end
        sbString.replace(3, 5, "QQ");
        System.out.println(sbString);

        System.out.println(sbString.length());

        // 当前容量
        System.out.println(sbString.capacity());

        // 截取
        String newStr = sbString.substring(3);
        System.out.println(newStr);
        // 截取 QQ
        String newStr2 = sbString.substring(3, 5);
        System.out.println(newStr2);
    }
}
