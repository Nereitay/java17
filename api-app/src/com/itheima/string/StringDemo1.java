package com.itheima.string;

/**
     目标：了解String类的特点：String类不可变的原理。

 String是不可变字符串的原因 ？
    - String变量每次的修改其实都是产生并指向了新的字符串对象。
    - 原来的字符串对象都是没有改变的，所以称不还字符串。

 字符串常量池在堆内存中

 */
public class StringDemo1 {
    public static void main(String[] args) {
        String name = "传智";
        name += "教育"; // name = name + "教育"
        name += "中心";
        System.out.println(name);
    }
}
