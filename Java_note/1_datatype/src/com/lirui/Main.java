package com.lirui;

public class Main {

    public static void main(String[] args) {
        // 基本数据类型
        // 数值型 整数类型(byte, short, int, long)
              // 浮点型(float, double)
        // 字符型(char)
        // 布尔型(boolean)

        // 引用数据类型, 类/接口/数组

        /*
        数据类型    说明    字节
        byte       字节型   1
        short      短整型   2
        int        整型     4
        long       长整型   8
        float      单精度   4
        double     双精度   8
        char       字符型   2
        boolean    布尔型   1
        */

        // 整型字面值
        // 定义int类型变量存放八进制数据
        int age = 037;
        // 0x1abcL 长整型的数据类型
        long longNum = 0xa2cdf3ffL;
        // 定义变量存放短整型数据
        short shortNum = 123;
        // 定义变量存放byte类型数据
        byte b = 10;

        // 浮点型字面值
        // 默认情况下表示double类型, 也可以在值后面加d/D, 如果表示float类型, 则需要在字面量后加f/F
        float f = 123.123F;
        double d = 1234; // D/F都可以, 精度向下是可以的, 整型赋值给浮点型

        // 字符型字面值
        char sex = 'A';
        // 把整型的值赋值给字符型, 根据ASCII来进行转换
        sex = 97;
        // ASCII码使用7位或8位二进制数组合来表示128或256种可能的字符
        // 7位标准的ASCII码, 8位二进制(后128位)扩展ASCII码

        // 布尔类型和字符串字面值
        boolean isFemale = true;
        // 定义一个空字符串
        String name = "";
        String str = "\u005d\u005fR";

        // 科学记数法
        double  number = 1.23e5; // 1.23 * 10 ^ 5
        float   num = 1.23E5f;

        // 自动(隐式)类型转换: byte -> short -> int -> long
        // char -> int -> float
        // long -> float, long -> double

        // 强制类型转换, 高精度转低精度时

        //TODO: 常量, 变量名大写
        final int AGE = 22;



        System.out.println(str);
    }
}
