package com.itheima.d2_reflect_class;

/**
 * 反射概述
 *      - 反射是指对于任何一个Class类，在"运行的时候"都可以直接得到这个类全部成分。
 *      - 在运行时,可以直接得到这个类的构造器对象：Constructor
 *      - 在运行时,可以直接得到这个类的成员变量对象：Field
 *      - 在运行时,可以直接得到这个类的成员方法对象：Method
 *      - 这种运行时动态获取类信息以及动态调用类中成分的能力称为Java语言的反射机制
 * 反射的关键：
 *      - 反射的第一步都是先得到编译后的Class类对象，然后就可以得到Class的全部成分
 *          HelloWorld.java -> javac -> HelloWorld.class
 *          Class c = HelloWorld.class;
   目标：反射的第一步：获取Class对象
 */
public class Test {
    public static void main(String[] args) throws Exception {
        /*
         1、Class类中的一个静态方法：forName(全限名：包名 + 类名)
         源代码阶段 -> 字节码文件
         */
        Class c = Class.forName("com.itheima.d2_reflect_class.Student");
        System.out.println(c); // Student.class

        /*
         2、类名.class
         内存 -> Class对象阶段
         */
        Class c1 = Student.class;
        System.out.println(c1);

        /*
         3、对象.getClass() 获取对象对应类的Class对象。
         Runtime运行阶段
         */
        Student s = new Student();
        Class c2 = s.getClass();
        System.out.println(c2);
    }

    /*
    反射的基本作用、关键？
        - 反射是在运行时获取类的字节码文件对象：然后可以解析类中的全部成分。
        - 反射的核心思想和关键就是:得到编译以后的class文件对象。
     */
}
