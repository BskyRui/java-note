package com.lirui.oop;

import java.io.*;

/**
 * Created by LargeRui on 4/23/17.
 */

// 字符流读写
public class UseInputStreamReader {

    public static void main(String[] args) {
        try {
            FileInputStream   fileInputStream = new FileInputStream("./src/hello.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            // 创建一个字符输出流
            FileOutputStream fileOutputStream = new FileOutputStream("./src/hello_new.txt");
            // 字节流转为字符流
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);

            // 定义每次读取的大小
            char[] chars = new char[100];
            String s = "";
            // 实际读取的大小
            int i = 0;
            while ( (i = inputStreamReader.read(chars)) != -1) {
                // s += new String(chars, 0, i);
                // 将读取到的内容写入到新文件, i是写入的长度
                outputStreamWriter.write(chars, 0, i);
            }

            System.out.println(s);
            // 关闭资源, 字符流要在前面关闭
            inputStreamReader.close();
            fileInputStream.close();

            outputStreamWriter.close();
            fileOutputStream.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
