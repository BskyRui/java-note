package com.lirui.oop;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by LargeRui on 6/13/16.
 */

// 通过字节流写入文件
public class UseFileOutputStream {

    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/hello.new");

            String s = "你好彩虹2222";

            fileOutputStream.write(s.getBytes());

            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
