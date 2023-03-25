package com.itheima.overload;

/**
 * 方法重载的识别技巧
 *  - 只要是同一个类中，方法名称相同、形参列表不同，那么他们就是重载的方法，其他都不管！（如：修饰符，返回值类型都无所谓）
 *  - 形参列表不同指的是：形参的个数、类型、顺序不同，不关心形参的名称
 */
public class MethodDemo2 {
    /*形参列表不同指的是：形参的个数、类型、顺序不同，不关心形参的名称*/
    // 新方法
    public static void open() {}

    // 重载方法
    public static void open(int a) {}

    // 重载方法
    static void open(int a, int b) {}

    // 重载方法
    public static void open(double a, int b) {}

    // 重载方法
    public static void open(int a, double b) {}

    // 重复方法
    // public void open(int i, double d) { }

    // 新方法
    public static void OPEN(){ }


}
