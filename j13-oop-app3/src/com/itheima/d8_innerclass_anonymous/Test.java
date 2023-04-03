package com.itheima.d8_innerclass_anonymous;

/**
      目标：学习匿名内部类的形式和特点。
 匿名内部类：
    - 本质上是一个没有名字的局部内部类，定义在方法中、代码块中、等。
 作用：方便创建子类对象，最终目的为了简化代码编写。

 匿名内部类的特点？
    - 匿名内部类是一个没有名字的内部类。
    - 匿名内部类写出来就会产生一个匿名内部类的对象。
    - 匿名内部类的对象类型相当于是当前new的那个的类型的子类类型

 */
public class Test {
    public static void main(String[] args) {
//        Animal animal = new Tiger();
//        animal.run();

        /*
        匿名内部类的对象类型相当于是当前new的那个的类型的子类类型
         */
        Animal a = new Animal(){
            @Override
            public void run() {
                System.out.println("老虎跑的块~~~");
            }
        };
        a.run();
    }
}

//class Tiger extends Animal{
//    @Override
//    public void run() {
//        System.out.println("老虎跑的块~~~");
//    }
//}

abstract class Animal{
    public abstract void run();
}