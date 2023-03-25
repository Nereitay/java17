package com.itheima.d8_extends_test;

/**
 * 理解继承的设计思想
 * 子类们相同特征（共性属性，共性方法）放在父类中定义，子类独有的的属性和行为应该定义在子类自己里面
 */
public class Test {
    public static void main(String[] args) {
        // 1、创建学生对象
        Student s = new Student();
        s.setName("张松松"); // 父类的
        s.setAge(25); // 父类的
        s.setClassName("Java999期"); // 子类的
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getClassName());
        s.queryCourse(); // 父类的
        s.writeInfo(); // 子类的

    }
}
