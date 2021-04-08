package com.lirui.oop;

import java.io.*;

public class CopyFile {

    public static void main(String[] args) {
	    File file = new File("QQ.png");
        // 文件是否存在
        System.out.println(file.exists());
        // 是否是目录
        System.out.println(file.isDirectory());

        // copy file, 当前路径是根目录, 即src所在的目录
        try {
            // 读取根目录下的QQ.png
            FileInputStream fileInputStream = new FileInputStream("QQ.png");
            // 定义写入文件对象
            FileOutputStream fileOutputStream = new FileOutputStream("./src/QQ_new.png");
            // 定义每次读取字节流大小
            byte[] b = new byte[30];

            // 读取并写入
            while (fileInputStream.read(b) != -1) {
                fileOutputStream.write(b);
            }

            // 关闭资源
            fileInputStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
