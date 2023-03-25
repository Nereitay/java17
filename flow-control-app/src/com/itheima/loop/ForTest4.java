package com.itheima.loop;

/**
 * 需求：找出水仙花数并输出
 * 水仙花数必须满足如下2个要求
 * 1.水仙花数是一个三位数
 * 2.水仙花数的个位、十位、百位的数字立方和等于原数
 */
public class ForTest4 {
    public static void main(String[] args) {
        // 在循环外定义一个变量用于记录水仙花的个数
        int count = 0;
        // 1、定义一个for循环找出全部三位数
        for (int i = 100; i <= 999; i++) {
            // 2、判断这个三位数是否满足要求
            // i = 157
            // 个位
            int ge = i % 10;
            // 十位
            int shi = i / 10 % 10;
            // 百位
            int bai = i / 100;
            if( (ge*ge*ge + shi * shi * shi + bai * bai * bai) == i){
                System.out.print(i+"\t");
                count++;
            }
        }
        System.out.println(); // 换行！
        System.out.println("水仙花个数是：" + count);
    }
}
