package com.itheima.param;

/**
 * 目标：理解引用类型的参数传递机制：值传递，区分其不同点
 *
 * 基本类型和引用类型的参数在传递的时候有什么不同？
 *  - 都是值传递。
 *  - 基本类型的参数传输存储的数据值。
 *  - 引用类型的参数传输存储的地址值。
 */
public class MethodDemo2 {
    public static void main(String[] args) {
        int[] arrs = {10, 20, 30};
        change(arrs);
        System.out.println(arrs[1]); // 222
    }

    public static void change(int[] arrs){
        System.out.println(arrs[1]); // 20
        arrs[1] = 222;
        System.out.println(arrs[1]); // 222
    }
}
