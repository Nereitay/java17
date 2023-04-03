package com.itheima.type;

/**
 * 目标：理解强制类型转换，并使用。
 */
public class TypeDemo3 {
    public static void main(String[] args) {

        int a = 20;
        byte b = (byte)a;
        System.out.println(a);
        System.out.println(b);

        // 强制类型转换可能造成数据(丢失)溢出
        int i = 1500;
        byte j = (byte) i;
        System.out.println(j);

        // 浮点型强转成整型，直接丢掉小数部分，保留整数部分返回
        double score = 99.5;
        int it = (int) score;
        System.out.println(it); // 99
    }
}
