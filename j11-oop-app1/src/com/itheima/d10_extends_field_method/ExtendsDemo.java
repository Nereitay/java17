package com.itheima.d10_extends_field_method;

/**
 * 继承后：成员变量、成员方法的访问特点
 * 就近原则
 */
public class ExtendsDemo {
    public static void main(String[] args) {
        Wolf w = new Wolf();
        System.out.println(w.name); // 子类的
        w.showName();
    }
}

class Animal{
    public String name = "父类动物";
}

class Wolf extends Animal{
    public String name = "子类动物";

    public void showName(){
        String name = "局部名称";
        /*
            重名情况下：先子类局部范围找, 然后子类成员范围找,然后父类成员范围找，如果父类范围还没有找到则报错
         */
        System.out.println(name); // 局部的
        /*
            this 访问子类成员
         */
        System.out.println(this.name); // 子类name
        /*
            通过super关键字，指定访问父类的成员
         */
        System.out.println(super.name); // 父类name
    }
}

