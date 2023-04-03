package com.itheima.d4_byte_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 需求：
 *      把某个视频复制到其他目录下的“b.avi”
 * 目标：学会使用字节流完成文件的复制（支持一切文件类型的复制）
 *
 * 字节流适合做一切文件数据的拷贝吗？
 *  - 任何文件的底层都是字节，拷贝是一字不漏的转移字节，只要前后文件格式、编码一致没有任何问题。
 */
public class CopyDemo05 {
    public static void main(String[] args) {
        try {
            /*
             1、创建一个字节输入流管道与原视频接通
             */
            InputStream is = new FileInputStream("D:\\jpg\\cat02.jpg");

            /*
             2、创建一个字节输出流管道与目标文件接通
             */
            OutputStream os = new FileOutputStream("file-io-app/src/cat02.jpg");

            /*
             3、定义一个字节数组转移数据
             */
            byte[] buffer = new byte[1024];
            int len; // 记录每次读取的字节数。
            while ((len = is.read(buffer)) != -1){
                os.write(buffer, 0 , len);
            }
            System.out.println("复制完成了！");

            /*
             4、关闭流。
             */
            os.close();
            is.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
