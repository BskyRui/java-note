package com.lirui.oop;

import java.io.FileInputStream;

/**
 * Created by LargeRui on 4/23/17.
 */

// 字节流读取
public class UseFileInputStream {

    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("./src/hello.txt");
            // 定义读取的大小
            byte[] bytes = new byte[30];

            String str = "";

            // 文件内容读取到bytes字节数组中去
            while (fileInputStream.read(bytes) != -1) {
                str += new String(bytes, "UTF-8");
            }

            System.out.println(str);
            fileInputStream.close();

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
