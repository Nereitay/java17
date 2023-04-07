package com.itheima.d5_tcp1;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * TCP: 建立管道 -> IO流
 * 在java中只要是使用java.net.Socket类实现通信，底层即是使用了TCP协议
 * <p>
 * 需求：客户端实现步骤
 *  1. 创建客户端的Socket对象，请求与服务端的连接。
 *  2. 使用socket对象调用getOutputStream()方法得到字节输出流。
 *  3. 使用字节输出流完成数据的发送。
 *  4. 释放资源：关闭socket管道
   目标：完成Socket网络编程入门案例的客户端开发，实现1发1收。
 */
public class ClientDemo1 {
    public static void main(String[] args) {
        try {
            System.out.println("====客户端启动===");
            /*
             1、创建Socket通信管道请求有服务端的连接
             */
            // public Socket(String host, int port)
            // 参数一：服务端的IP地址
            // 参数二：服务端的端口
            Socket socket = new Socket("127.0.0.1", 7777);

            /*
             2、从socket通信管道中得到一个字节输出流 负责发送数据
             */
            OutputStream os = socket.getOutputStream();

            /*
             3、把低级的字节流包装成打印流
             */
            PrintStream ps = new PrintStream(os);

            /*
             4、发送消息
             ps.print()会出异常：java.net.SocketException: Connection reset
               因为bufferReader是readline，读一行，但发送的消息没有换行符
             */
            ps.print("我是TCP的客户端，我已经与你对接，并发出邀请：约吗？");
            ps.flush();

            /*
             关闭资源。不建议关，因为关的速度比传输快，可能引起消息还没发送到，管道就关闭的bug
             */
            // socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
