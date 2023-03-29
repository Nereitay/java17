package com.itheima.d9_map_impl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

/**
    目标：认识Map体系的特点：按照键无序，不重复，无索引。值不做要求。

 LinkedHashMap集合概述和特点
    - 由键决定：有序、不重复、无索引。
    - 这里的有序指的是保证存储和取出的元素顺序一致
    - 原理：底层数据结构是依然哈希表，只是每个键值对元素又额外的多了一个双链表的机制记录存储的顺序
 */
public class LinkedHashMapDemo2 {
    public static void main(String[] args) {
        // 1、创建一个Map集合对象
        Map<String, Integer> maps = new LinkedHashMap<>();
        maps.put("鸿星尔克", 3);
        maps.put("Java", 1);
        maps.put("枸杞", 100);
        maps.put("Java", 100); // 覆盖前面的数据
        maps.put(null, null);
        System.out.println(maps);

    }
}
