package com.itheima.d5_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

/**
 * 对象反序列化：
 *  - 使用到的流是对象字节输入流：ObjectInputStream
 * 作用：以内存为基准，把存储到磁盘文件中去的对象数据恢复成内存中的对象，称为对象反序列化。
 * 对象反序列化的含义是什么？
 *  - 把磁盘中的对象数据恢复到内存的Java对象中。
 * 对象反序列化用到了哪个流？
 *  - 对象字节输入流ObjectInputStram
 *  - public Object readObject()

 目标：学会进行对象反序列化：使用对象字节输入流把文件中的对象数据恢复成内存中的Java对象。
 */
public class ObjectInputStreamDemo2 {
    public static void main(String[] args) throws Exception {
        /*
         1、创建对象字节输入流管道包装低级的字节输入流管道
         */
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("io-app2/src/obj.txt"));

        /*
         2、调用对象字节输入流的反序列化方法
         */
        Student s = (Student) ois.readObject();

        System.out.println(s);
    }
}
