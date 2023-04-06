package com.itheima.d7_thread_comunication;

/**
 * 线程通信案例模拟
 *  - 模拟客服系统，系统可以不断的接入电话 和 分发给客服
 * 线程通信的前提：线程通信通常是在多个线程操作同一个共享资源的时候需要进行通信，且要保证线程安全
   呼叫系统。
 */
public class CallSystem {
    // 定义一个变量记录当前呼入进来的电话。
    public static int number = 0; // 最多只接听一个。

    /**
     * 接入电话
     */
    public synchronized static void call() {
        try {
            number++;
            System.out.println("成功接入一个用户，等待分发~~~~");

            /*
            Object类的等待和唤醒方法: wait() 当前线程等待，直到另一个线程调用notify() 或 notifyAll()唤醒自己,
            notify() 唤醒正在等待对象监视器(锁对象)的单个线程,
            notifyAll() 唤醒正在等待对象监视器(锁对象)的所有线程
            上述方法应该使用当前同步锁对象进行调用
             */
            // 唤醒别人 : 1个
            CallSystem.class.notify();
            // 让当前线程对象进入等待状态。
            CallSystem.class.wait();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 分发电话
     */
    public synchronized static void receive() {
        try {
            String name = Thread.currentThread().getName();
            if (number == 1) {
                System.out.println(name + "此电话已经分发给客服并接听完毕了~~~~~");
                number--;
                // 唤醒别人 : 1个
                CallSystem.class.notify();
                CallSystem.class.wait(); // 让当前线程等待
            } else {
                // 唤醒别人 : 1个
                CallSystem.class.notify();
                CallSystem.class.wait(); // 让当前线程等待
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
