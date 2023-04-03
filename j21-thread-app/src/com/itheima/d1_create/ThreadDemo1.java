package com.itheima.d1_create;

/**
 * 方式一优缺点：
 *  - 优点：编码简单
 *  - 缺点：线程类已经继承Thread，无法继承其他类，不利于扩展。
 * 1. 为什么不直接调用了run方法，而是调用start启动线程。
 *      - 直接调用run方法会当成普通方法执行，此时相当于还是单线程执行。
 *      - 只有调用start方法才是启动一个新的线程执行。
 * <p>
 * 2、不建议把主线程任务放在子线程之前了。
 *  - 这样主线程一直是先跑完的，相当于是一个单线程的效果了。

 目标：多线程的创建方式一：继承Thread类实现。
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        /*
         3、new一个新线程对象
         */
        Thread t = new MyThread();
        /*
         4、调用start方法启动线程（执行的还是run方法）
         */
        t.start(); // 直接调用run方法会当成普通方法执行，此时相当于还是单线程执行

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出：" + i);
        }

    }
}

/*
   1、定义一个线程类继承Thread类
 */
class MyThread extends Thread {
    /*
       2、重写run方法，里面是定义线程以后要干啥
     */
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程执行输出：" + i);
        }
    }
}