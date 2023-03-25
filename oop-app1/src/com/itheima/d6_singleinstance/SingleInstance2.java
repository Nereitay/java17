package com.itheima.d6_singleinstance;

/**
    目标：设计懒汉单例
 在真正需要该对象的时候，才去创建一个对象(延迟加载对象)
 */
/*
    1. 定义一个单例类
 */
public class SingleInstance2 {
    /*
       3、定义一个静态的成员变量用于存储一个对象，一开始不要初始化对象，因为人家是懒汉
     */
    private static SingleInstance2 instance; // null

    /*
       2、私有构造器
     */
    private SingleInstance2(){
    }

    /*
      4、提供一个返回单例对象的方法，真正调用这个方法的时候才创建一个单例对象
     */
    public static SingleInstance2 getInstance(){
        if(instance == null){
            // 第一次来拿对象，为他做一个对象
            instance = new SingleInstance2();
        }
        return instance;
    }
}
