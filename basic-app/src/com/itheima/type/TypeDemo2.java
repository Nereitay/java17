package com.itheima.type;

/**
 * 目标：掌握表达式的自动类型转换的规则。
 */
public class TypeDemo2 {
    public static void main(String[] args) {

        byte a = 10;
        int b = 20;
        double c = 1.0;
        double rs = a + b + c;
        System.out.println(rs);

        double rs2 = a + b - 2.3;
        System.out.println(rs2);

        /*面试题
        在表达式中，byte、short、char 是直接转换成int类型参与运算的
         */
        byte i = 100;
        byte j = 120;
        int k = i + j;
        System.out.println(k);
    }
}
