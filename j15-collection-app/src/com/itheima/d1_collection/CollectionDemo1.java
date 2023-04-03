package com.itheima.d1_collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
    目标：明确Collection集合体系的特点

   集合是java中存储 对象 数据的一种容器
    集合的大小不固定，启动后可以动态变化，类型也可以选择不固定。集合更像气球
    集合非常适合做元素的增删操作。

 1、数组和集合的元素存储的个数问题。
    - 数组定义后类型确定，长度固定
    - 集合类型可以不固定，大小是可变的。
 2、数组和集合存储元素的类型问题。
    - 数组可以存储基本类型和引用类型的数据。
    - 集合只能存储引用数据类型的数据。
 3、数组和集合适合的场景
    - 数组适合做数据个数和类型确定的场景。
    - 集合适合做数据个数不确定，且要做增删元素的场景。


 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        /*
        有序 可重复 有索引 => List
         */
        Collection list = new ArrayList();
        list.add("Java");
        list.add("Java");
        list.add("Mybatis");
        list.add(23);
        list.add(23);
        list.add(false);
        list.add(false);
        System.out.println(list);

        /*
         无序 不重复  无索引 => Set
         */
        Collection set = new HashSet();
        set.add("Java");
        set.add("Java");
        set.add("Mybatis");
        set.add(23);
        set.add(23);
        set.add(false);
        set.add(false);
        System.out.println(set);

        System.out.println("-----------------------------");
        /*
        集合都是支持泛型的，可以在编译阶段约束集合只能操作某种数据类型
         */
        // Collection<String> list2 = new ArrayList<String>();
        Collection<String> list2 = new ArrayList<>(); // JDK 7开始之后后面类型申明可以不写
        list2.add("Java");
        // list2.add(23);
        list2.add("黑马");

        /*
         集合和泛型不支持基本数据类型，只能支持引用数据类型,所以集合中存储的元素都认为是对象
             存储基本类型使用包装类
         */
        // Collection<int> list3 = new ArrayList<>();
        Collection<Integer> list3 = new ArrayList<>();
        list3.add(23);
        list3.add(233);
        list3.add(2333);

        Collection<Double> list4 = new ArrayList<>();
        list4.add(23.4);
        list4.add(233.0);
        list4.add(233.3);
    }
}
