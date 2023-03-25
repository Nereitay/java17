package com.itheima.d7_extends;

/**
 * 学习继承和认识继承的好处
 * 继承就是java允许我们用extends关键字，让一个类和另一个类建立起一种父子关系
 * 提高代码复用性，减少代码冗余，增强类的功能扩展性
 */
/*
    父类
 */
public class People {
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
