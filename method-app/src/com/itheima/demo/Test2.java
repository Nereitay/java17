package com.itheima.demo;

/**
 * 需求：判断一个整数是奇数还是偶数 并进行结果的输出 使用方法完成
 */
public class Test2 {
    public static void main(String[] args) {
        check(11);
        System.out.println("-------------");
        check(100);
    }

    public static void check(int number) {
        if(number % 2 == 0){
            System.out.println(number + "是偶数");
        }else {
            System.out.println(number + "是奇数");
        }
    }
}
