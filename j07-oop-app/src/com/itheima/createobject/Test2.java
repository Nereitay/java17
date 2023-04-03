package com.itheima.createobject;

/**
 * 定义类的补充注意事项
 *  - 成员变量的完整定义格式是：修饰符 数据类型 变量名称 = 初始化值； 一般无需指定初始化值，存在默认值。
 *  - 类名首字母建议大写，且有意义，满足“驼峰模式”。
 *  - 一个Java文件中可以定义多个class类，且只能一个类是public修饰，而且public修饰的类名必须成为代码文件名。
 *      ** 实际开发中建议还是一个文件定义一个class类。
 */
public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.height);

        Student s2 = new Student();
        System.out.println(s2.name);
        System.out.println(s2.height);
    }
}
