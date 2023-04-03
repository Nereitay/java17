package com.itheima.d1_collection_set;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * LinkedHashSet
 *
 * 有序、不重复、无索引。
 * 这里的有序指的是保证存储和取出的元素顺序一致
 * 原理：底层数据结构是依然哈希表，只是每个元素又额外的多了一个双链表的机制记录存储的顺序
 * 牺牲内存，记录信息更多
 */
public class SetDemo4 {
    public static void main(String[] args) {
        Set<String> sets = new LinkedHashSet<>(); // 有序  不重复 无索引
        sets.add("MySQL");
        sets.add("MySQL");
        sets.add("Java");
        sets.add("Java");
        sets.add("HTML");
        sets.add("HTML");
        sets.add("SpringBoot");
        sets.add("SpringBoot");
        System.out.println(sets);
    }
}
