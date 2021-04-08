package com.lirui.oop;


// 包名小写
import com.largerui.hello.Hello;

public class Main {

    public static void main(String[] args) {
        Hello h2 = new Hello();
        // 当不同包下有相同的class名的时候, 使用com.largerui.hello.Hello h = new com.largerui.hello.Hello();

        // 导出jar
        // 1. file -> project structure -> artifacts -> +
        // 2. out directory -> xxx.jar

        // 导入jar
        // 1. 将xxx.jar复制到项目的project/lib下
        // 2. 右键 -> add as library
    }
}
