package com.itheima.d4_upd3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * UDP如何实现广播
 *  - 使用广播地址：255.255.255.255
 * 具体操作：
 *  - 发送端发送的数据包的目的地写的是广播地址、且指定端口。 （255.255.255.255  ,   9999）
 *  - 本机所在网段的其他主机的程序只要注册对应端口就可以收到消息了。（9999）
 *
 * UDP如何实现组播
 *  - 使用组播地址：224.0.0.0 ~ 239.255.255.255
 * 具体操作：
 *  - 发送端的数据包的目的地是组播IP  (例如：224.0.1.1,  端口：9999)
 *  - 接收端必须绑定该组播IP(224.0.1.1)，端口还要注册发送端的目的端口9999 ，这样即可接收该组播消息。
 *  - DatagramSocket的子类MulticastSocket可以在接收端绑定组播IP
  发送端  多发 多收
 */
public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("=====客户端启动======");

        // 1、创建发送端对象：发送端自带默认的端口号（人）
        DatagramSocket socket = new DatagramSocket();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请说：");
            String msg = sc.nextLine();

            if ("exit".equals(msg)) {
                System.out.println("离线成功！");
                socket.close();
                break;
            }

            // 2、创建一个数据包对象封装数据（韭菜盘子）
            byte[] buffer = msg.getBytes();
            /*
             注意：只要目的地IP是 255.255.255.255 这个消息将以广播的形式对外发送
             */
//            DatagramPacket packet = new DatagramPacket( buffer, buffer.length,
//                    InetAddress.getByName("255.255.255.255") , 8888);

            /*
            使用组播地址：224.0.0.0 ~ 239.255.255.255
             */
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length,
                    InetAddress.getByName("224.0.1.1"), 9898);

            // 3、发送数据出去
            socket.send(packet);
        }
    }
}
