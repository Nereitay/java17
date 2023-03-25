package com.itheima.demo;

/**
 * 需求：定义一个方法，方法中计算出 1-n的和并返回
 *
 * 定义方法重点关注的是哪两点？
 *  - 方法是否需要申明返回值类型。
 *  - 方法是否需要定义形参列表
 */
public class Test1 {
    public static void main(String[] args) {
        // 需求：使用方法计算1-n的和并返回
        System.out.println("1-5的和是：" + sum(5));
        System.out.println("--------------------");
        System.out.println("1-100的和是：" + sum(100));
    }

    public static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += i;
        }
        return sum;
    }
}
