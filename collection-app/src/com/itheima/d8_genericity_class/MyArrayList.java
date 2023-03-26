package com.itheima.d8_genericity_class;

import java.util.ArrayList;

/**
 * 泛型类
 * 定义类的同时定义了泛型的类 ：修饰符 class 类名<泛型变量> { }
 *
 * 此处泛型变量T可以随便写为任意标识，常见的如E、T、K、V
 *
 * 作用：编译阶段可以指定数据类型，类似于集合的作用
 *
 * 泛型类的原理：把出现泛型变量的地方全部替换成传输的真实数据类型
 * @param <E>
 *
 *
 */
public class MyArrayList<E> {
    private ArrayList<E> lists = new ArrayList<>();

    public void add(E e){
        lists.add(e);
    }

    public void remove(E e){
        lists.remove(e);
    }

    @Override
    public String toString() {
        return lists.toString();
    }
}
