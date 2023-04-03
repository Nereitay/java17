package com.itheima.d2_recusion;

/**
 * 什么是方法递归?
 *      - 方法直接调用自己或者间接调用自己的形式称为方法递归（ recursion）。
 *      - 递归做为一种算法在程序设计语言中广泛应用
 *  递归的形式
 *      - 直接递归：方法自己调用自己。
 *      - 间接递归：方法调用其他方法，其他方法又回调方法自己
 *  方法递归存在的问题？
 *      - 递归如果没有控制好终止，会出现递归死循环，导致栈内存溢出现象
 */
public class RecursionDemo01 {
    public static void main(String[] args) {
        test2();
    }

    public static void test(){
        System.out.println("=======test被执行========");
        test(); // 方法递归 直接递归形式
    }

    public static void test2(){
        System.out.println("=======test2被执行========");
        test3(); // 方法递归 间接递归
    }

    private static void test3() {
        System.out.println("=======test3被执行========");
        test2();
    }
}












