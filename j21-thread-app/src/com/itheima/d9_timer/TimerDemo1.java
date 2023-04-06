package com.itheima.d9_timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 定时器
 *      - 定时器是一种控制任务延时调用，或者周期调用的技术。
 *      - 作用：闹钟、定时邮件发送
 * 定时器的实现方式
 *     方式一：Timer
 *     方式二： ScheduledExecutorService
 * Timer定时器的特点和存在的问题
 *      - 1、Timer是单线程，处理多个任务按照顺序执行，存在延时与设置定时器的时间有出入。
 *      - 2、可能因为其中的某个任务的异常使Timer线程死掉，从而影响后续任务执行
    目标：Timer定时器的使用和了解。
 */
public class TimerDemo1 {
    public static void main(String[] args) {
        /*
         1、创建Timer定时器
         */
        Timer timer = new Timer();  // 定时器本身就是一个单线程。
        /*
         2、调用方法，处理定时任务
         */
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行AAA~~~" + new Date());
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        }, 0, 2000);

        /*
        Timer 是单线程 -> 可能因为其中的某个任务的异常使Timer线程死掉，从而影响后续任务执行
         */
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行BB~~~"+ new Date());
                System.out.println(10/0);
            }
        }, 0, 2000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行CCC~~~"+ new Date());
            }
        }, 0, 3000);
    }
}
