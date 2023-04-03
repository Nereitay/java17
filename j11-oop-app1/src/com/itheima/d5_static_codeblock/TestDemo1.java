package com.itheima.d5_static_codeblock;

/**
 * 学习静态代码块的特点、基本作用
 *  作用
 *      - 如果要在启动系统时对数据进行初始化
 *      - 建议使用静态代码块完成数据的初始化操作，代码优雅
 *
 * 代码块
 *  是类的五大成分之一 成员变量，构造器，方法，代码块，内部类
 *  定义在类中方法外，使用{}
 *
 */
public class TestDemo1 {

    public static String schoolName;

    public static void main(String[] args) {
        System.out.println("=========main方法被执行输出===========");
        System.out.println(schoolName);
    }

    /*
     特点：与类一起加载，自动触发一次，优先执行
     作用：可以在程序加载时进行静态数据的初始化操作（准备内容）
     */
    static {
        System.out.println("==静态代码块被触发执行==");
        schoolName = "黑马程序员";
    }
}
