package com.itheima.d8_sort_binarysearch;

/**
    目标：理解二分搜索的原理并实现。

 在数据量特别大的时候，基本查找从前往后寻找的性能是很差的！
 二分查询性能好，二分查找的前提是必须是排好序的数据
    - 二分查找相当于每次去掉一半的查找范围

 二分查找 --- 元素不存在
    - 结论：二分查找正常的检索条件应该是开始位置min <= 结束位置max

 数组的二分查找的实现步骤是什么样的?
 - 定义变量记录左边和右边位置。
 - 使用while循环控制查询（条件是左边位置<=右边位置）
 - 循环内部获取中间元素索引
 - 判断当前要找的元素如果大于中间元素，左边位置=中间索引+1
 - 判断当前要找的元素如果小于中间元素，右边位置=中间索引-1
 - 判断当前要找的元素如果等于中间元素，返回当前中间元素索引

 */
public class Test2 {
    public static void main(String[] args) {
        // 1、定义数组
        int[] arr = {10, 14, 16, 25, 28, 30, 35, 88, 100};
        //                                            r
        //                                                l
        //
        System.out.println(binarySearch(arr , 35));
        System.out.println(binarySearch(arr , 350));
    }
    /**
     * 二分查找算法的实现
     * @param arr  排序的数组
     * @param data 要找的数据
     * @return  索引，如果元素不存在，直接返回-1
     */
    public static int binarySearch(int[] arr, int data){
        // 1、定义左边位置  和 右边位置
        int left = 0;
        int right = arr.length - 1;

        // 2、开始循环，折半查询。
        while (left <= right){
            // 取中间索引
            int middleIndex = (left + right) / 2;
            // 3、判断当前中间位置的元素和要找的元素的大小情况
            if(data > arr[middleIndex]) {
                // 往右边找，左位置更新为 = 中间索引+1
                left = middleIndex + 1;
            }else if(data < arr[middleIndex]) {
                // 往左边找，右边位置 = 中间索引 - 1
                right = middleIndex - 1;
            }else {
                return middleIndex;
            }
        }
        return -1; // 查无此元素
    }


}
