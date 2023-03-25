package com.itheima.d8_abstract_attention;

/**
 * 抽象类特征和注意事项
 * final和abstract是什么关系？
 *  互斥关系
 *      abstract定义的抽象类作为模板让子类继承，final定义的类不能被继承。
 *      抽象方法定义通用功能让子类重写，final定义的方法子类不能重写。
 */
public abstract class Animal {
    private  String name;
    public Animal(){
    }
    public abstract void run();
    public abstract void run2();

    public void eat(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
