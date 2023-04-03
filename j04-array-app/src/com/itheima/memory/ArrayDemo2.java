package com.itheima.memory;

/**
 * 两个数组变量指向同一个数组对象
 */
public class ArrayDemo2 {

    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33};
        int[] arr2 = arr1;

        System.out.println(arr1); // [I@65ab7765
        System.out.println(arr2); // [I@65ab7765

        arr2[1] = 99;
        System.out.println(arr1[1]); // 99
        System.out.println(arr2[1]); // 99
    }



}
