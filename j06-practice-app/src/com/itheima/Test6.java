package com.itheima;

/**
     需求：某系统的数字密码，比如1983，采用加密方式进行传输，规则如下：先得到每位数，
        然后每位数都加上5再对10求余，最后将所有数字反转，得到一串新数。

    ***** 即使加密方法又是解密方法

 */
public class Test6 {
    public static void main(String[] args) {
        // 1、定义一个数组存储需要加密的数据
        int[] arr = new int[]{1, 9, 8, 3};

        // 2、遍历数组中的每个数据，按照规则进行修改
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }

        // 3、把数组中的元素进行反转操作。
        /*
            定义2个变量分别占数组的首尾位置
            一个变量往前走，一个变量往后走，同步交换双方位置处的值
         */
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            // 交换 i 和 j位置处的值，即可反转
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }

        // 4、遍历数组中的每个元素输出即可
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
