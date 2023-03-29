package com.itheima.d9_map_impl;

import com.itheima.d1_collection_set.Student;
import java.util.HashMap;
import java.util.Map;

/**
 * 使用最多的Map集合是HashMap
 *
 * HashMap的特点：
 *  - HashMap是Map里面的一个实现类。特点都是由键决定的：无序、不重复、无索引
 *  - 没有额外需要学习的特有方法，直接使用Map里面的方法就可以了。
 *  - HashMap跟HashSet底层原理是一模一样的，都是哈希表结构，只是HashMap的每个元素包含两个值而已
 *      实际上：Set系列集合的底层就是Map实现的，只是Set集合中的元素只要键数据，不要值数据而已
 * HashMap的特点和底层原理
 *  - 由键决定：无序、不重复、无索引。HashMap底层是哈希表结构的。
 *  - 依赖hashCode方法和equals方法保证键的唯一。
 *  - 如果键要存储的是自定义对象，需要重写hashCode和equals方法。
 *  - 基于哈希表。增删改查的性能都较好
 */
public class HashMapDemo1 {
    public static void main(String[] args) {
         // Map集合是根据键去除重复元素
        Map<Student, String> maps = new HashMap<>();

        Student s1 = new Student("无恙", 20, '男');
        Student s2 = new Student("无恙", 20, '男');
        Student s3 = new Student("周雄", 21, '男');

        maps.put(s1, "北京");
        maps.put(s2, "上海");
        maps.put(s3, "广州");

        System.out.println(maps);
    }
}
