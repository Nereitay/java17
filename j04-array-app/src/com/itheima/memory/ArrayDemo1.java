package com.itheima.memory;

/**
 * java内存分布，数组内存
 */
public class ArrayDemo1 {

    public static void main(String[] args) {
        int a = 12;
        System.out.println(a); // 12

        int[] arr = {11, 22, 33};
        System.out.println(arr); // [I@65ab7765

        arr[0] = 44;
        arr[1] = 55;
        arr[2] = 66;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
