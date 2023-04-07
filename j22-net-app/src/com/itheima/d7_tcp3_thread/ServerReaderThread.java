package com.itheima.d7_tcp3_thread;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * 1. 之前我们的通信是否可以同时与多个客户端通信，为什么？
 *      - 不可以的
 *      - 单线程每次只能处理一个客户端的Socket通信
 * 2、如何才可以让服务端可以处理多个客户端的通信需求？
 *      - 引入多线程。
 */
public class ServerReaderThread extends Thread{
    private final Socket socket;
    public ServerReaderThread(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
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
            while ((msg = br.readLine()) != null){
                System.out.println(socket.getRemoteSocketAddress() + "说了：: " + msg);
            }
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress() + "下线了！！！");
        }
    }
}
