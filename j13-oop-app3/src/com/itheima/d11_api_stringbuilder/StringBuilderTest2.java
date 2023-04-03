package com.itheima.d11_api_stringbuilder;

/**
 * 设计一个方法用于输出任意整型数组的内容，要求输出成如下格式：
 *  “该数组内容为：[11, 22, 33, 44, 55]”
 */
public class StringBuilderTest2 {
    public static void main(String[] args) {
        int[] arr1 = null;
        System.out.println(toString(arr1));

        int[] arr2 = {10, 88, 99};
        System.out.println(toString(arr2));

        int[] arr3 = {};
        System.out.println(toString(arr3));
    }

    /*
       1、定义方法接收任意整型数组，返回数组内容格式
     */
    public static String toString(int[] arr){
       if(arr != null){
            // 2、开始拼接内容。
           StringBuilder sb = new StringBuilder("[");
           for (int i = 0; i < arr.length; i++) {
               sb.append(arr[i] ).append(i == arr.length - 1 ? "" : ", ");
           }
           sb.append("]");
           return sb.toString();
       }else {
           return null;
       }
    }
}
