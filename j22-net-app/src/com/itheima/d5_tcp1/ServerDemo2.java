package com.itheima.d5_tcp1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 需求：服务端实现步骤
 *  1. 创建ServerSocket对象，注册服务端端口。
 *  2. 调用ServerSocket对象的accept()方法，等待客户端的连接，并得到Socket管道对象。
 *  3. 通过Socket对象调用getInputStream()方法得到字节输入流、完成数据的接收。
 *  4. 释放资源：关闭socket管道

   目标：开发Socket网络编程入门代码的服务端，实现接收消息
 */
public class ServerDemo2 {
    public static void main(String[] args) {
        try {
            System.out.println("===服务端启动成功===");
            /*
             1、注册端口
             */
            ServerSocket serverSocket = new ServerSocket(7777);
            /*
             2、必须调用accept方法：等待接收客户端的Socket连接请求，建立Socket通信管道
             */
            Socket socket = serverSocket.accept();
            /*
             3、从socket通信管道中得到一个字节输入流
             */
            InputStream is = socket.getInputStream();
            /*
             4、把字节输入流包装成缓冲字符输入流进行消息的接收
             */
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            /*
             5、按照行读取消息
             */
            String msg;
            if ((msg = br.readLine()) != null){
                System.out.println(socket.getRemoteSocketAddress() + "说了：: " + msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    TCP通信服务端用的代表类？
        - ServerSocket类,注册端口。
        - 调用accept()方法阻塞等待接收客户端连接。得到Socket对象。
    TCP通信的基本原理？
        - 客户端怎么发，服务端就应该怎么收。
        - 客户端如果没有消息，服务端会进入阻塞等待。
        - Socket一方关闭或者出现异常、对方Socket也会失效或者出错
     */
}
