package com.lirui.oop;

import java.io.*;

public class GoodsTest {

    // 1) 创建一个继承Serializable接口的类
    // 2) 创建该对象
    // 3) 将对象写入文件
    // 4) 从文件读取对象信息

    // 对象输入流 ObjectInputStream
    // 对象输出流 ObjectOutputStream


    public static void main(String[] args) {
	    // 定义一个对象
        Goods goods = new Goods("香蕉", 2.22f, 1234);

        try {
            // 定义对象输入输出流
            FileInputStream fileInputStream = new FileInputStream("./src/serializable.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            FileOutputStream fileOutputStream = new FileOutputStream("./src/serializable.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // 将对象信息写入文件
            objectOutputStream.writeObject(goods);
            objectOutputStream.writeBoolean(true);
            objectOutputStream.flush();

            // 读取对象
            try {
                Goods goods1 = (Goods) objectInputStream.readObject();
                System.out.println(goods1);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            objectOutputStream.close();
            fileOutputStream.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
