package com.itheima.d4_byte_stream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 1、如何使用字节输入流读取中文内容输出不乱码呢？
 *      - 定义一个与文件一样大的字节数组，
 *      - 一次性读取完文件的全部字节。
 * 2、直接把文件数据全部读取到一个字节数组可以避免乱码，是否存在问题？
 *      - 如果文件过大，字节数组可能引起内存溢出。
 目标：使用文件字节输入流一次读完文件的全部字节。可以解决乱码问题。
 */
public class FileInputStreamDemo03 {
    public static void main(String[] args) throws Exception {
        /*
         1、创建一个文件字节输入流管道与源文件接通
         */
        File f = new File("file-io-app/src/data03.txt");
        InputStream is = new FileInputStream(f);

        /*
         2、定义一个字节数组与文件的大小刚刚一样大。
         new byte[(int) f.length()]
         */
//        byte[] buffer = new byte[(int) f.length()];
//        int len = is.read(buffer);
//        System.out.println("读取了多少个字节：" + len);
//        System.out.println("文件大小：" + f.length());
//        System.out.println(new String(buffer));

        /*
         2, 读取全部字节数组  java9 才出现
         is.readAllBytes()
         */
        byte[] buffer = is.readAllBytes();
        System.out.println(new String(buffer));

        is.close();
    }
}
