package com.itheima.d1_collection_set;

import java.util.Set;
import java.util.TreeSet;

/**
   目标：观察TreeSet对于有值特性的数据如何排序。
        学会对自定义类型的对象进行指定规则排序

 TreeSet集合概述和特点
    - 不重复、无索引、可排序
    - 可排序：按照元素的大小默认升序（有小到大）排序。
    - TreeSet集合底层是基于红黑树的数据结构实现排序的，增删改查性能都较好。
    - 注意：TreeSet集合是一定要排序的，可以将元素按照指定的规则进行排序。

 */
public class SetDemo5 {
    public static void main(String[] args) {
        /*
        有值特性排序 -> Integer
         */
        Set<Integer> sets = new TreeSet<>(); // 不重复 无索引 可排序
        sets.add(23);
        sets.add(24);
        sets.add(12);
        sets.add(8);
        System.out.println(sets);

        /*
        有值特性排序 -> String
         */
        Set<String> sets1 = new TreeSet<>(); // 不重复 无索引 可排序
        sets1.add("Java");
        sets1.add("Java");
        sets1.add("angela");//小写排在所有大写后面
        sets1.add("黑马");
        sets1.add("Java");
        sets1.add("About");
        sets1.add("Python");
        sets1.add("UI");
        sets1.add("UI");
        System.out.println(sets1);

        System.out.println("------------------------------");

        /*
        自定义类型的对象进行指定规则排序
         */
        // 方式二：TreeSet集合有参数构造器，可以设置Comparator接口对应的比较器对象，来定制比较规则
        //
//        Set<Apple> apples = new TreeSet<>(new Comparator<Apple>() {
//            @Override
//            public int compare(Apple o1, Apple o2) {
//                // return o1.getWeight() - o2.getWeight(); // 升序
//                // return o2.getWeight() - o1.getWeight(); // 降序
//                // 注意：浮点型建议直接使用Double.compare进行比较
//                // return Double.compare(o1.getPrice() , o2.getPrice()); // 升序
//                return Double.compare(o2.getPrice() , o1.getPrice()); // 降序
//            }
//        });

        /*
        如果TreeSet集合存储的对象有实现比较规则，集合也自带比较器，默认使用集合自带的比较器排序
         */
        Set<Apple> apples = new TreeSet<>(( o1,  o2) ->  Double.compare(o2.getPrice() , o1.getPrice())  );
        apples.add(new Apple("红富士", "红色", 9.9, 500));
        apples.add(new Apple("青苹果", "绿色", 15.9, 300));
        apples.add(new Apple("绿苹果", "青色", 29.9, 400));
        apples.add(new Apple("黄苹果", "黄色", 9.8, 500));
        System.out.println(apples);
    }

    /*
    两种方式中，关于返回值的规则：
        - 如果认为第一个元素大于第二个元素返回正整数即可。
        - 如果认为第一个元素小于第二个元素返回负整数即可。
        - 如果认为第一个元素等于第二个元素返回0即可，此时TreeSet集合只会保留一个元素，认为两者重复
     */
}
