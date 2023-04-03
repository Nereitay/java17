package com.itheima.d7_innerclass_methodLocal;

/**
    目标：了解局部内部类的语法
 局部内部类 （鸡肋语法，了解即可）
    - 局部内部类放在方法、代码块、构造器等执行体中。
    - 局部内部类的类文件名为： 外部类$N内部类.class。

 */
public class Test {

    static {
         class Dog{

         }

         abstract class Animal{

         }

         interface SportManInter{

         }
    }

    public static void main(String[] args) {
        class Cat{
            private String name;

            public static int onLineNumber = 100;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        interface SportManInter{

        }

        Cat c = new Cat();
        c.setName("叮当猫~");
        System.out.println(c.getName());
    }
}
