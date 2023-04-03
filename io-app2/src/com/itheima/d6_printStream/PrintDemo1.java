package com.itheima.d6_printStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * 打印流
 *  - 作用：打印流可以实现方便、高效的打印数据到文件中去。打印流一般是指：PrintStream，PrintWriter两个类。
 * 可以实现打印什么数据就是什么数据，例如打印整数97写出去就是97，打印boolean的true，写出去就是true
 * <p>
 * PrintStream和PrintWriter的区别
 *  - 打印数据功能上是一模一样的，都是使用方便，性能高效（核心优势）
 *  - PrintStream继承自字节输出流OutputStream，支持写字节数据的方法。
 *  - PrintWriter继承自字符输出流Writer，支持写字符数据出去。

 目标：学会使用打印流 高效  方便写数据到文件。
 */
public class PrintDemo1 {
    public static void main(String[] args) throws Exception {
        /*
         1、创建一个打印流对象
         */
//        PrintStream ps = new PrintStream(new FileOutputStream("io-app2/src/ps.txt"));
        PrintStream ps = new PrintStream(new FileOutputStream("io-app2/src/ps.txt" , true)); // 追加数据，在低级管道后面加True
//        PrintStream ps = new PrintStream("io-app2/src/ps.txt" );
        /*
        public PrintWriter(File file) throws FileNotFoundException {
            this(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file))),false);
        }
         */
//        PrintWriter ps = new PrintWriter("io-app2/src/ps.txt", StandardCharsets.UTF_8); // 打印功能上与PrintStream的使用没有区别

        ps.println(97);
        ps.println('a');
        ps.println(23.3);
        ps.println(true);
        ps.println("我是打印流输出的，我是啥就打印啥");

        ps.close();
    }
}
