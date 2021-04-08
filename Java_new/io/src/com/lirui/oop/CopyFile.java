package com.lirui.oop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by LargeRui on 6/13/16.
 */
public class CopyFile {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("QQ.png");
            FileOutputStream fileOutputStream = new FileOutputStream("src/QQ_new.png");
            // 定义每次读取字节流的大小
            byte[] b = new byte[30];

            while(fileInputStream.read(b) != -1){
                fileOutputStream.write(b);
            }

            fileInputStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
