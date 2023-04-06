package com.itheima.d3_thread_safe;

/**
 * 线程安全问题出现的原因？
 *      - 存在多线程并发
 *      - 同时访问共享资源
 *      - 存在修改共享资源
   取钱的线程类
 */
public class DrawThread extends Thread {
    // 接收处理的账户对象
    private final Account acc;
    public DrawThread(Account acc,String name){
        super(name);
        this.acc = acc;
    }
    @Override
    public void run() {
        // 小明 小红：取钱
        acc.drawMoney(100000);
    }

    /*
     * 线程安全问题发生的原因是什么？
     *  - 多个线程同时访问同一个共享资源且存在修改该资源
     */
}
