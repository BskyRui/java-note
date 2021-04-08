package com.lirui.oop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

// 字节流读写
public class UseFileInputStream {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/hello.txt");
            // 定义读取的大小
            byte[] bytes = new byte[3];

            String str = "";
            while (fileInputStream.read(bytes) != -1) {
                str += new String(bytes, "UTF-8");
            }

            System.out.println(str);

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
