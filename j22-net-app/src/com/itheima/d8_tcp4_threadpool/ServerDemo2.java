package com.itheima.d8_tcp4_threadpool;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
 * 本次使用线程池的优势在哪里？
 *      - 服务端可以复用线程处理多个客户端，可以避免系统瘫痪。
 *      - 适合客户端通信时长较短的场景
   目标：实现服务端可以同时处理多个客户端的消息。
 */
public class ServerDemo2 {

    /*
     使用静态变量记住一个线程池对象
     */
    private static ExecutorService pool = new ThreadPoolExecutor(3,
            5, 6, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(2)
    , Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy()); // java.util.concurrent.RejectedExecutionException

    public static void main(String[] args) {
        try {
            System.out.println("===服务端启动成功===");
            // 1、注册端口
            ServerSocket serverSocket = new ServerSocket(6666);
            // a.定义一个死循环由主线程负责不断的接收客户端的Socket管道连接。
            while (true) {
                // 2、每接收到一个客户端的Socket管道，
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress()+ "它来了，上线了！");

                /*
                 任务对象负责读取消息。
                 */
                Runnable target = new ServerReaderRunnable(socket);
                pool.execute(target);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
