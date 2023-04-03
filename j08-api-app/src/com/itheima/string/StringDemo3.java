package com.itheima.string;

public class StringDemo3 {
    public static void main(String[] args) {
        test1();

        test2();


    }

    private static void test1() {
        String s1 = "abc";
        // Java存在编译优化机制，程序在编译时： “a” + “b” + “c” 会直接转成 "abc"
        String s2 = "a" + "b" + "c";
        System.out.println(s1 == s2); // true
    }

    private static void test2() {
        String s1 = "abc";
        String s2 = "ab";
        // 只要不是双引号直接赋值，运算结果放在堆内存中
        String s3 = s2 + "c";
        System.out.println(s1 == s3); // false
    }
}
