package com.itheima.d6_tcp2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
   目标：开发Socket网络编程入门代码的服务端，实现接收消息
 */
public class ServerDemo2 {
    public static void main(String[] args) {
        try {
            System.out.println("===服务端启动成功===");
            // 1、注册端口
            ServerSocket serverSocket = new ServerSocket(7777);
            /*
            可以使用死循环控制服务端收完消息继续等待接收下一个消息
            本案例实现了多发多收，那么是否可以同时接收多个客户端的消息？
                - 不可以的。因为服务端现在只有一个线程，只能与一个客户端进行通信
             */
            while (true) {
                // 2、必须调用accept方法：等待接收客户端的Socket连接请求，建立Socket通信管道
                Socket socket = serverSocket.accept();
                // 3、从socket通信管道中得到一个字节输入流
                InputStream is = socket.getInputStream();
                // 4、把字节输入流包装成缓冲字符输入流进行消息的接收
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                // 5、按照行读取消息
                String msg;
                while ((msg = br.readLine()) != null) {
                    System.out.println(socket.getRemoteSocketAddress() + "说了：: " + msg);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*
本次多发多收是如何实现的
    - 客户端使用循环反复地发送消息。
    - 服务端使用循环反复地接收消息。
现在服务端为什么不可以同时接收多个客户端的消息。
    - 目前服务端是单线程的，每次只能处理一个客户端的消息
 */