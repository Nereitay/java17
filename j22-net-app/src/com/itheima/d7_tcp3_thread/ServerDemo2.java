package com.itheima.d7_tcp3_thread;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * 本次是如何实现服务端接收多个客户端的消息的。
 *      - 主线程定义了循环负责接收客户端Socket管道连接
 *      - 每接收到一个Socket通信管道后分配一个独立的线程负责处理它
   目标：实现服务端可以同时处理多个客户端的消息。
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
             a.定义一个死循环由主线程负责不断的接收客户端的Socket管道连接。
             */
            while (true) {
                /*
                 2、每接收到一个客户端的Socket管道，交给一个独立的子线程负责读取消息
                 */
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress()+ "它来了，上线了！");
                /*
                 3、开始创建独立线程处理socket
                 */
                new ServerReaderThread(socket).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*
目前的通信架构存在什么问题？
    - 客户端与服务端的线程模型是： N-N的关系。
    - 客户端并发越多，系统瘫痪的越快
 */
