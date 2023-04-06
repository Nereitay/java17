package com.itheima.d9_timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * ScheduledExecutorService是 jdk1.5中引入了并发包，目的是为了弥补Timer的缺陷, ScheduledExecutorService内部为线程池
 * ScheduledExecutorService的优点
 *      - 基于线程池，某个任务的执行情况不会影响其他定时任务的执行
    目标：ScheduledExecutorService定时器的使用和了解。
 */
public class TimerDemo2 {
    public static void main(String[] args) {
        /*
         1、创建ScheduledExecutorService线程池，做定时器
         */
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(3);

        /*
         2、开启定时任务
         */
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行输出：AAA  ==》 " + new Date());
                try {
                    Thread.sleep(100000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, 0, 2, TimeUnit.SECONDS);


        /*
        基于线程池，某个任务的执行情况不会影响其他定时任务的执行
         */
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行输出：BBB  ==》 " + new Date());
                System.out.println(10 / 0);
            }
        }, 0, 2, TimeUnit.SECONDS);


        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行输出：CCC  ==》 " + new Date());
            }
        }, 0, 2, TimeUnit.SECONDS);

    }
}
