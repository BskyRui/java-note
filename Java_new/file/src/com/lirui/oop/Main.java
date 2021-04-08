package com.lirui.oop;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        /*
        File f = new File("src/com/lirui/oop/");

        if (f.isFile()) {
            System.out.println("file exsit...");
        }

        if (f.isDirectory()) {
            System.out.println("is directory...");
        }
        */


        // 文件创建/删除/重命名
        /*
        File f = new File("./src/hello.txt");
        File newf = new File("hello.new");
        try {
            if (f.createNewFile()) {
                System.out.println("create file success...");
            } else {
                // file delete
                // System.out.println("file exist...");
                // f.delete();
                // System.out.println("file delete success...");
                f.renameTo(newf);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        // 目录的创建/删除/重命名
        // 目录下为空的时候才能删除
        /*
        File f = new File("./src/indi/lirui2");
        File newDir = new File("./src/lirui-directory");
        if (f.mkdirs()) {
            System.out.println("directory create success...");
        } else {
            System.out.println("directory create fail...");
            // f.delete();
            f.renameTo(newDir);
        }
        */

        // 文件属性读取和设置
        /*
        File f = new File("src/note.txt");
        try {
            if (f.createNewFile()) {
                System.out.println("file create fail...");
            } else {
                System.out.println(f.length() + "bytes");
                System.out.println((float)f.length() / 1024 + "kb");
                // 相对路径(父)
                System.out.println(f.getParent());
                // 绝对路径
                System.out.println(f.getAbsolutePath());
                // 父目录的绝对路径
                System.out.println(new File(f.getAbsolutePath()).getParent());

                System.out.println(f.canRead());
                f.setReadOnly();
                System.out.println(f.canWrite());
                f.setWritable(true);
                System.out.println(f.canWrite());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        // 文件内容读取
        /*
        File file = new File("src/note.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // 从文件系统中的某个文件中获得输入字节
            FileInputStream fileInputStream = new FileInputStream(file);
            // InputStreamReader 是字节流通向字符流的桥梁：它使用指定的 charset 读取字节并将其解码为字符。
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            // 从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String str;
            while((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
            }

            // 关闭资源
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        // 文件写入(和文件写入对应)
        File file = new File("src/note.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            // FileOutputStream文件输出流是用于将数据写入 File 或 FileDescriptor 的输出流。
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            // OutputStreamWriter是字符流通向字节流的桥梁：可使用指定的 charset 将要写入流中的字符编码成字节。
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
            // BufferedWriter将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            bufferedWriter.write("hello2");

            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
