package com.lirui.oop;

import java.io.*;

/**
 * Created by LargeRui on 6/13/16.
 */

// 字符流读写数据

public class UseInputStreamReader {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/hello.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");

            // 创建一个字符输出流
            FileOutputStream fileOutputStream = new FileOutputStream("src/hello_new.txt");
            // 字节流转为字符流
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf-8");

            // 定义每次读取的大小
            char[] chars = new char[100];

            String s = "";

            // 实际读取的大小
            int i = 0;

            while((i = inputStreamReader.read(chars)) != -1) {
                // s += new String(chars, 0, i);

                // 将读取到的内容写入到新文件 i是写入的长度
                outputStreamWriter.write(chars, 0, i);
            }

            System.out.println(s);
            outputStreamWriter.close();
            fileOutputStream.close();
            inputStreamReader.close();
            fileInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
