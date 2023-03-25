package com.itheima.demo;

/**
 * 冒泡排序
 *  从头开始两两比较，把较大的元素与较小的元素进行交换
 *  每轮把当前最大的一个元素存入到数组当前的末尾。
 */
public class Test5 {
    public static void main(String[] args) {
        // 1、定义一个数组，存储一些数据啊
        int[] arr = {5, 2, 3, 1};
        //           0  1  2  3

        // 2、定义一个外部循环控制总共需要冒几轮（数组的长度-1）
        for (int i = 0; i < arr.length - 1; i++) {
            // i == 0  比较的次数 3  j = 0 1 2
            // i == 1  比较的次数 2  j = 0 1
            // i == 2  比较的次数 1  j = 0
            // 3、定义一个内部循环，控制每轮依次往后比较几个位置（数组长度-i-1）
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 4, 如果当前位置的元素值>后一个位置的元素值，两者交换
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // 遍历数组内容输出
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

}
