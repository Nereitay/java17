package com.itheima.d7_reflect_framework;

import java.util.Date;
import java.util.Properties;

/**
   目标：提供一个通用框架，支持保存所有对象的具体信息。
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        Student s = new Student();
        s.setName("猪八戒");
        s.setClassName("西天跑路1班");
        s.setAge(1000);
        s.setHobby("吃，睡");
        s.setSex('男');
        MybatisUtil.save(s);

        Teacher t = new Teacher();
        t.setName("波仔");
        t.setSex('男');
        t.setSalary(6000);
        MybatisUtil.save(t);
    }
}

/*
反射的作用？
    - 可以在运行时得到一个类的全部成分然后操作。
    - 可以破坏封装性。（很突出）
    - 也可以破坏泛型的约束性。（很突出）
    - 更重要的用途是适合：做Java高级框架
    - 基本上主流框架都会基于反射设计一些通用技术功能
 */
