package com.itheima.d5_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
    目标：认识Map体系的特点：按照键无序，不重复，无索引。值不做要求。

 Map集合是一种双列集合，每个元素包含两个数据。
 Map集合的每个元素的格式：key=value(键值对元素)。
 Map集合也被称为“键值对集合”

 Collection集合的格式: [元素1,元素2,元素3..]
 Map集合的完整格式：{key1=value1 , key2=value2 , key3=value3 , ...}

 Map集合非常适合做类购物车这样的业务场景

 Map集合体系特点 HashMap , LinkedHashMap , TreeMap
    - Map集合的特点都是由键决定的。
    - Map集合的键是无序,不重复的，无索引的，值不做要求（可以重复）。
    - Map集合后面重复的键对应的值会覆盖前面重复键的值。
    - **Map集合的键值对都可以为null**

 */
public class MapDemo1 {
    public static void main(String[] args) {
        // 1、创建一个Map集合对象
        // Map<String, Integer> maps = new HashMap<>(); // 一行经典代码
        Map<String, Integer> maps = new LinkedHashMap<>(); // 有序
        maps.put("鸿星尔克", 3);
        maps.put("Java", 1);
        maps.put("枸杞", 100);
        maps.put("Java", 100); // 覆盖前面的数据
        maps.put(null, null); // Map集合的键值对都可以为null
        System.out.println(maps);

    }
}
