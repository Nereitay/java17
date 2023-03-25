package com.itheima.createobject;

/**
 * 在Java中 ，必须先设计类 ，才能获得对象
 */
public class Car {
    // 属性（成员变量） 一般无需指定初始化值，存在默认值
    String name; // 名称
    double price; // 价格

    // 行为（方法）
    public void start(){
        System.out.println(name + " 价格是：" + price +", 启动成功！");
    }

    public void run(){
        System.out.println(name + " 价格是：" + price +", 跑的很快！");
    }
}
