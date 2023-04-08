package com.itheima.d6_reflect_genericity;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 *反射的作用-绕过编译阶段为集合添加数据
 *  - 反射是作用在运行时的技术，此时集合的泛型将不能产生约束了，此时是可以为集合存入其他任意类型的元素
 *  - 泛型只是在编译阶段可以约束集合只能操作某种数据类型，在编译成Class文件进入运行阶段的时候，其真实类型都是ArrayList了，泛型相当于被擦除了
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        // 需求：反射实现泛型擦除后，加入其他类型的元素
        ArrayList<String> lists1 = new ArrayList<>();
        ArrayList<Integer> lists2 = new ArrayList<>();

        /*
        在编译成Class文件进入运行阶段的时候，其真实类型都是ArrayList了
         */
        System.out.println(lists1.getClass()); // class java.util.ArrayList
        System.out.println(lists2.getClass()); // class java.util.ArrayList

        System.out.println(lists1.getClass() ==  lists2.getClass());  // ArrayList.class

        System.out.println("---------------------------");
        ArrayList<Integer> lists3 = new ArrayList<>();
        lists3.add(23);
        lists3.add(22);
        // lists3.add("黑马");

        Class c = lists3.getClass(); // ArrayList.class  ===> public boolean add(E e)
        // 定位c类中的add方法
        Method add = c.getDeclaredMethod("add", Object.class);
        boolean rs = (boolean) add.invoke(lists3, "黑马");
        System.out.println(rs);

        System.out.println(lists3);

        ArrayList list4 = lists3;
        list4.add("白马");
        list4.add(false);
        System.out.println(lists3);
    }
}
