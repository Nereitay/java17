package com.itheima.d9_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * 模拟企业业务功能开发，并完成每个功能的性能统计
 * 需求
 *      - 模拟某企业用户管理业务，需包含用户登录，用户删除，用户查询功能，并要统计每个功能的耗时
 * 分析
 *      - 定义一个UserService表示用户业务接口，规定必须完成用户登录，用户删除，用户查询功能。
 *      - 定义一个实现类UserServiceImpl实现UserService，并完成相关功能，且统计每个功能的耗时。
 *      - 定义测试类，创建实现类对象，调用方法
 * 本案例存在哪些问题？
 *      - 业务对象的的每个方法都要进行性能统计，存在大量重复的代码
 * 动态代理
 *      - 代理就是被代理者没有能力或者不愿意去完成某件事情，需要找个人代替自己去完成这件事，动态代理就是用来对业务功能（方法）进行代理的
 * 关键步骤
 *      1.必须有接口，实现类要实现接口（代理通常是基于接口实现的）。
 *      2.创建一个实现类的对象，该对象为业务对象，紧接着为业务对象做一个代理对象
    public static Object newProxyInstance(ClassLoader loader,  Class<?>[] interfaces, InvocationHandler h)
    参数一：类加载器，负责加载代理类到内存中使用。
    参数二：获取被代理对象实现的全部接口。代理要为全部接口的全部方法进行代理
    参数三：代理的核心处理逻辑
 */
public class ProxyUtil {
    /**
      生成业务对象的代理对象。
     * @param obj
     * @return
     */
    public static <T> T  getProxy(T obj) {
        // 返回了一个代理对象了
        return (T) Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new InvocationHandler() {
                    /*
                    参数一：代理对象本身。一般不管
                    参数二：正在被代理的方法
                    参数三：被代理方法，应该传入的参数
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        long startTimer = System .currentTimeMillis();
                        /*
                         马上触发方法的真正执行。(触发真正的业务功能)
                         */
                        Object result = method.invoke(obj, args);
                        long endTimer = System.currentTimeMillis();
                        System.out.println(method.getName() + "方法耗时：" + (endTimer - startTimer) / 1000.0 + "s");
                        /*
                         把业务功能方法执行的结果返回给调用者
                         */
                        return result;
                    }
                });
    }
    /*
    动态代理的优点
        - 非常的灵活，支持任意接口类型的实现类对象做代理，也可以直接为接本身做代理。
        - 可以为被代理对象的所有方法做代理。
        - 可以在不改变方法源码的情况下，实现对方法功能的增强。
        - 不仅简化了编程工作、提高了软件系统的可扩展性，同时也提高了开发效率
     */
}
