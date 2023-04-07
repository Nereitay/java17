package com.itheima.d10_tcp5_bs;

import java.io.PrintStream;
import java.net.Socket;

/**
 * TCP通信如何实现BS请求网页信息回来呢？
 *      - 客户端使用浏览器发起请求（不需要开发客户端）
 *      - 服务端必须按照浏览器的协议规则响应数据。
 *      - 浏览器使用什么协议规则呢？
 *      - HTTP协议（简单了解下）
 */
public class ServerReaderRunnable implements Runnable {
    private final Socket socket;

    public ServerReaderRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            /*
             浏览器 已经与本线程建立了Socket管道
             */
            PrintStream ps = new PrintStream(socket.getOutputStream());
            /*
            响应消息给浏览器显示
            必须响应HTTP协议格式数据，否则浏览器不认识消息
             */
            ps.println("HTTP/1.1 200 OK"); // 协议类型和版本 响应成功的消息！
            ps.println("Content-Type:text/html;charset=UTF-8"); // 响应的数据类型：文本/网页

            ps.println(); // 必须发送一个空行

            // 才可以响应数据回去给浏览器
            ps.println("<span style='color:red;font-size:90px'>《最牛的149期》 </span>");
            ps.close();
            /*
            在网页输入http://localhost:8080/   看到网页效果
             */
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress() + "下线了！！！");
        }
    }
}
