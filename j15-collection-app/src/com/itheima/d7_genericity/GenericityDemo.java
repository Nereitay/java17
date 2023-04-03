package com.itheima.d7_genericity;

import java.util.ArrayList;
import java.util.List;

/**
    目标：泛型的概述。

    什么是泛型？
        泛型就是一个标签：<数据类型>
        泛型可以在编译阶段约束只能操作某种数据类型。

    注意：
        JDK 1.7开始之后后面的泛型申明可以省略不写
    小结：
         泛型就是一个标签。
         泛型可以在编译阶段约束只能操作某种数据类型。
         泛型只能支持引用数据类型。

 集合体系的全部接口和实现类都是支持泛型的使用的

 泛型的好处：
    - 统一数据类型。
    - 把运行时期的问题提前到了编译期间，避免了强制类型转换可能出现的异常，因为编译阶段类型就能确定下来

 泛型可以在很多地方进行定义:
    - 类后面 -> 泛型类
    - 方法申明上 -> 泛型方法
    - 接口后面 -> 泛型接口
 */
public class GenericityDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java2");
        // list.add(23);

//        List list1 = new ArrayList();
        List<String> list1 = new ArrayList<>();
        list1.add("Java");
//        list1.add(23.3);
//        list1.add(false);
        list1.add("Spring");

//        for (Object o : list1) {
//            String ele = (String) o;
//            System.out.println(ele);
//        }

        for (String s : list1) {
            System.out.println(s);
        }

        System.out.println("---------------------");
        // 存储任意类型的元素
        List<Object> list2 = new ArrayList<>();
        list2.add(23);
        list2.add(23.3);
        list2.add("Java");

        // List<int> list3 = new ArrayList<>(); //只支持引用类型
        List<Integer> list3 = new ArrayList<>();
    }
}
