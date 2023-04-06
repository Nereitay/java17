package com.itheima.d1_create;

/**
 * 1. 第二种方式是如何创建线程的？
 *      - 定义一个线程任务类MyRunnable实现Runnable接口，重写run()方法
 *      - 创建MyRunnable对象
 *      - 把MyRunnable任务对象交给Thread线程对象处理。
 *      - 调用线程对象的start()方法启动线程
 * <p>
 * 2. 第二种方式的优点
 *      - 优点：线程任务类只是实现了Runnable接口，可以继续继承和实现。
 *      - 缺点：如果线程有执行结果是不能直接返回的。
 * <p>
 * 目标：学会线程的创建方式二，理解它的优缺点。
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        /*
         3、创建一个任务对象
         */
        Runnable target = new MyRunnable(); //编程多一层对象包装
        /*
         4、把任务对象交给Thread处理
         */
        Thread t = new Thread(target);
        // Thread t = new Thread(target, "1号"); //给线程取名
        /*
         5、启动线程
         */
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行输出：" + i);
        }
    }
}

/*
 * 1、定义一个线程任务类 实现Runnable接口
 */
class MyRunnable implements Runnable {
    /*
     * 2、重写run方法，定义线程的执行任务的
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程执行输出：" + i);
        }
    }
}
