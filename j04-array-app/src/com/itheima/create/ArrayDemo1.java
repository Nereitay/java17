package com.itheima.create;

import java.util.Arrays;

/**
 * 目标：学会使用静态初始化的方式定义数组
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        // 数据类型[] 数组名称 = new 数据类型[]{元素1,元素2,...}
        double[] scores1 = new double[]{99.5, 88.0, 75.5};

        double[] scores = {99.5, 88.0, 75.5}; // 简化写法

        int[] ages1 = new int[]{12, 24, 36};
        int[] ages = {12, 24, 36};

        String[] names1 = new String[]{"牛二", "全蛋儿", "老王"};
        String[] names = {"牛二", "全蛋儿", "老王"};

        System.out.println(Arrays.toString(scores));
    }
}
