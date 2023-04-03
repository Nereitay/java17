package com.itheima.d1_byte_buffer;

import java.io.*;

/**
 * 缓冲流概述
 *  - 缓冲流也称为高效流、或者高级流。之前学习的字节流可以称为原始流。
 *  - 作用：缓冲流自带缓冲区、可以提高原始字节流、字符流读写数据的性能
 * 字节缓冲流性能优化原理：
 *  - 字节缓冲输入流自带了8KB缓冲池，以后我们直接从缓冲池读取数据，所以性能较好。
 *  - 字节缓冲输出流自带了8KB缓冲池，数据就直接写入到缓冲池中去，写数据性能极高了。
    目标：使用字节缓冲流完成数据的读写操作。
 */
public class ByteBufferDemo {
    public static void main(String[] args) {

        try (
                // 这里面只能放置资源对象，用完会自动关闭：自动调用资源对象的close方法关闭资源（即使出现异常也会做关闭操作）
                // 1、创建一个字节输入流管道与原视频接通
                InputStream is = new FileInputStream("D:\\jpg\\cat01.jpg");
                /*
                 a.把原始的字节输入流包装成高级的缓冲字节输入流
                 */
                InputStream bis = new BufferedInputStream(is);
                // 2、创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream("io-app2/src/cat01.jpg");
                /*
                 b.把字节输出流管道包装成高级的缓冲字节输出流管道
                 */
                OutputStream bos = new BufferedOutputStream(os);

        ) {

            /*
             3、定义一个字节数组转移数据
             */
            byte[] buffer = new byte[1024];
            int len; // 记录每次读取的字节数。
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer, 0 , len);
            }
            System.out.println("复制完成了！");

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
