package com.itheima.d6_abstract_class;

/**
 * 抽象类
 * 如果一个类中的某个方法的具体实现不能确定，就可以申明成abstract修饰的抽象方法（不能写方法体了），
 * 这个类必须用abstract修饰，被称为抽象类
 */
public abstract class Animal {
    private String name;

    public abstract void run();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    1、抽象类的作用是什么样的？
        可以被子类继承、充当模板的、同时也可以提高代码复用。
    2、抽象方法是什么样的？
        只有方法签名，没有方法体，使用了abstract修饰。
    3、继承抽象类有哪些要注意？
        一个类如果继承了抽象类，那么这个类必须重写完抽象类的全部抽象方法。
        否则这个类也必须定义成抽象类。
     */
}
