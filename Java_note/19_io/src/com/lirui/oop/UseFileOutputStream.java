package com.lirui.oop;

import java.io.FileOutputStream;

/**
 * Created by LargeRui on 4/23/17.
 */

// 字节流写入
public class UseFileOutputStream {

    public static void main(String[] args) {

        try {
            // 第二个参数是否追加
            FileOutputStream fileOutputStream = new FileOutputStream("./src/hello.txt.new", true);
            String str = "I am bksyrui...2";

            fileOutputStream.write(str.getBytes());

            fileOutputStream.close();

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

    }
}
