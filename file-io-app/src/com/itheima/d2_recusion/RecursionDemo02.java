package com.itheima.d2_recusion;

/**
 * 递归案例导学-计算1-n的阶乘
 * 目标：递归的算法和执行流程
 *
 * 递归解决问题的思路：
 *  - 把一个复杂的问题层层转化为一个与原问题相似的规模较小的问题来求解
 *
 * 递归算法三要素大体可以总结为：
 *  - 递归的公式： f(n) =  f(n-1) * n;
 *  - 递归的终结点：f(1)
 *  - 递归的方向必须走向终结点：
 */
public class RecursionDemo02 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }

    public static int f(int n){
        if(n == 1){
            return 1;
        }else {
            return f(n - 1) * n; // 递升归回
        }
    }
}












