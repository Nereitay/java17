package com.itheima.d1_inetAddress;
import java.net.InetAddress;
/**
 * 实现网络编程关键的三要素
 *      1. IP地址：设备在网络中的地址，是唯一的标识。
 *      2. 端口：应用程序在设备中唯一的标识。
 *      3. 协议:   数据在网络中传输的规则，常见的协议有UDP协议和TCP协议
 * <p>
 * InetAddress 的使用: 此类表示Internet协议（IP）地址
 *
    目标：InetAddress类概述（了解）
         一个该类的对象就代表一个IP地址对象。

    InetAddress类成员方法：
         static InetAddress getLocalHost()
            * 获得本地主机IP地址对象。
         static InetAddress getByName(String host)
            * 根据IP地址字符串或主机名获得对应的IP地址对象。
         String getHostName()
            * 获得主机名。
         String getHostAddress()
            * 获得IP地址字符串。
 */
public class InetAddressDemo01 {
    public static void main(String[] args) throws Exception {
        /*
         1.获取本机地址对象。
         */
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        /*
         2.获取域名ip对象
         */
        InetAddress ip2 = InetAddress.getByName("www.google.es");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        /*
         3.获取公网IP对象。
         */
        InetAddress ip3 = InetAddress.getByName("142.250.200.68");
        System.out.println(ip3.getHostName());
        System.out.println(ip3.getHostAddress());

        /*
         4.判断是否能通： ping  5s之前测试是否可通
         */
        System.out.println(ip3.isReachable(5000));
    }
}