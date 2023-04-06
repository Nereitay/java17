package com.itheima.d2_api;
/**
 *  Thread常用方法：获取线程名称getName()、设置名称setName()、获取当前线程对象currentThread()
    目标：线程的API
 */
public class ThreadDemo01 {
    /*
     main方法是由主线程负责调度的
     */
    public static void main(String[] args) {
        Thread t1 = new MyThread("1号");
        // t1.setName("1号");
        t1.start();
        System.out.println(t1.getName());

        Thread t2 = new MyThread("2号");
        // t2.setName("2号");
        t2.start();
        System.out.println(t2.getName());

        /*
        Thread.currentThread()
         哪个线程执行它，它就得到哪个线程对象（当前线程对象）
         */
        // 主线程的名称就叫main
        Thread main = Thread.currentThread();
        System.out.println(main.getName());
        main.setName("最牛的线程");

        for (int i = 0; i < 5; i++) {
            System.out.println( main.getName() + "输出：" + i);
        }
    }
}










