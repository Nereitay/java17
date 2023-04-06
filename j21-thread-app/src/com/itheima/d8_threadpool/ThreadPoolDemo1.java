package com.itheima.d8_threadpool;

import java.util.concurrent.*;

/**
 * 线程池就是一个可以复用线程的技术
 * 不使用线程池的问题
 *     - 如果用户每发起一个请求，后台就创建一个新线程来处理，下次新任务来了又要创建新线程，而创建新线程的开销是很大的，这样会严重影响系统的性能
 * <p>
 * 谁代表线程池？
 *      - JDK 5.0起提供了代表线程池的接口：ExecutorService
 * 如何得到线程池对象
 *      - 方式一：使用ExecutorService的实现类ThreadPoolExecutor自创建一个线程池对象
 *      - 方式二：使用Executors（线程池的工具类）调用方法返回不同特点的线程池对象
    目标：自定义一个线程池对象，并测试其特性。
 */
public class ThreadPoolDemo1 {
    public static void main(String[] args) {
        /*
         1、创建线程池对象
         */
        /**
         public ThreadPoolExecutor(
             int corePoolSize, 指定线程池的线程数量（核心线程） 不能小于0
             int maximumPoolSize, 指定线程池可支持的最大线程数 最大数量 >= 核心线程数量
             long keepAliveTime, 指定临时线程的最大存活时间 不能小于0
             TimeUnit unit, 指定存活时间的单位(秒、分、时、天) 时间单位
             BlockingQueue<Runnable> workQueue, 指定任务队列 不能为null
             ThreadFactory threadFactory, 指定用哪个线程工厂创建线程 不能为null
             RejectedExecutionHandler handler) 指定线程忙，任务满的时候，新任务来了怎么办 不能为null

         新任务拒绝策略
             ThreadPoolExecutor.AbortPolicy 丢弃任务并抛出RejectedExecutionException异常。是默认的策略
             ThreadPoolExecutor.DiscardPolicy 丢弃任务，但是不抛出异常 这是不推荐的做法
             ThreadPoolExecutor.DiscardOldestPolicy 抛弃队列中等待最久的任务 然后把当前任务加入队列中
             ThreadPoolExecutor.CallerRunsPolicy 由主线程负责调用任务的run()方法从而绕过线程池直接执行
         )
         */
        ExecutorService pool = new ThreadPoolExecutor(3, 5 ,
                6, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5) , Executors.defaultThreadFactory(),
               new ThreadPoolExecutor.AbortPolicy() );

        /*
         2、给任务线程池处理。
         */
        Runnable target = new MyRunnable();
        /*
        void execute(Runnable command)
            执行任务/命令，没有返回值，一般用来执行 Runnable 任务
         */
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        /*
        临时线程什么时候创建啊？
            新任务提交时发现核心线程都在忙，任务队列也满了，并且还可以创建临时线程，此时才会创建临时线程
         */
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        // 创建临时线程
        pool.execute(target);
        pool.execute(target);

        /*
        什么时候会开始拒绝任务？
            核心线程和临时线程都在忙，任务队列也满了，新的任务过来的时候才会开始任务拒绝
         */
//        // 不创建，拒绝策略被触发！！！
//        pool.execute(target);

        // 关闭线程池（开发中一般不会使用）。
        // pool.shutdownNow(); // 立即关闭，即使任务没有完成，会丢失任务的！
        pool.shutdown(); // 会等待全部任务执行完毕之后再关闭（建议使用的）
    }
}
