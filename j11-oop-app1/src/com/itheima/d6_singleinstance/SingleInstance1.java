package com.itheima.d6_singleinstance;

/**
 * 目标：学会使用饿汉单例模式设计单例类
 * 在用类获取对象的时候，对象已经提前为你创建好了
 */
/*
    1. 定义一个单例类
 */
public class SingleInstance1 {
    /*
       3. 定义一个静态变量存储一个对象：属于类，与类一起加载一次
     */
    // public static int onLineNumber = 21;
    public static SingleInstance1 instance = new SingleInstance1();

    /*
        2、必须私有构造器：私有构造器对外不能被访问。
     */
    private SingleInstance1() {
    }


}
