package com.itheima.d3_udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

/**
 * 需求: 使用UDP通信方式开发接收端和发送端。
 * 分析
 *      - 发送端可以一直发送消息。
 *      - 接收端可以不断的接收多个发送端的消息展示。
 *      - 发送端输入了exit则结束发送端程序。
  发送端  多发 多收
 */
public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("=====客户端启动======");

        // 1、创建发送端对象：发送端自带默认的端口号（人）
        DatagramSocket socket = new DatagramSocket();

        Scanner sc = new Scanner(System.in);
        /*
        发送端可以一直发送消息
         */
        while (true) {
            System.out.println("请说：");
            String msg = sc.nextLine();

            if("exit".equals(msg)){
                System.out.println("离线成功！");
                socket.close();
                break;
            }

            // 2、创建一个数据包对象封装数据（韭菜盘子）
            byte[] buffer = msg.getBytes();
            DatagramPacket packet = new DatagramPacket( buffer, buffer.length,
                    InetAddress.getLocalHost() , 8888);

            // 3、发送数据出去
            socket.send(packet);
        }

    }
}
