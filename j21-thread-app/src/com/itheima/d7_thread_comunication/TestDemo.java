package com.itheima.d7_thread_comunication;

public class TestDemo {
    public static void main(String[] args) {
        // 1、生产者线程：负责不断接收打进来的电话
        CallThread call = new CallThread();
        call.start();

        // 2、消费者线程：客服，每个客服每次接听一个电话
        ReceiveThread r1 = new ReceiveThread();
        r1.start();
    }

    /*
    什么是线程通信、如何实现？
        - 所谓线程通信就是线程间相互发送数据，线程间共享一个资源即可实现线程通信
    线程通信常见形式
        - 通过共享一个数据的方式实现。
        - 根据共享数据的情况决定自己该怎么做，以及通知其他线程怎么做
    线程通信实际应用场景
        - 生产者与消费者模型：生产者线程负责生产数据，消费者线程负责消费生产者产生的数据。
        - 要求：生产者线程生产完数据后唤醒消费者，然后等待自己，消费者消费完该数据后唤醒生产者，然后等待自己
     */
}
