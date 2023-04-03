package com.itheima.d1_collection_set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 看看Set系列集合的特点： HashSet LinkedHashSet TreeSet
 *
 */
public class SetDemo1 {
    public static void main(String[] args) {
        /*
        无序  不重复，无索引 => HashSet
         */
        Set<String> sets = new HashSet<>(); // 一行经典代码
        /*
        有序  不重复 无索引 => LinkedHashSet
         */
//         Set<String> sets = new LinkedHashSet<>();
        /*
        可排序  不重复 无索引 => LinkedHashSet
         */
//        Set<String> sets = new TreeSet<>();

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
