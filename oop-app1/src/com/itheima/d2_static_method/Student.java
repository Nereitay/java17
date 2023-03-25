package com.itheima.d2_static_method;

/**
 * 静态成员方法：如果该方法是以执行一个共用功能为目的，则可以申明成静态方法
 * 表示对象自己的行为的，且方法中需要访问实例成员的，则该方法必须申明成实例方法
 */
public class Student {
    private String name;
    private int age;

    /*
        实例方法：无static修饰，属于对象的，通常表示对象自己的行为，可以访问对象的成员变量
     */
    public void study(){
        System.out.println(name + "在好好学习，天天向上~~");
    }

    /*
        静态方法：有static修饰，属于类，可以被类和对象共享访问。
     */
    public static void getMax(int a, int b){
        System.out.println(a > b ? a : b);
    }

    public static void main(String[] args) {
        // 1、类名.静态方法
        Student.getMax(10, 100);
        // 注意：同一个类中访问静态成员 可以省略类名不写
        getMax(200, 20);

        // 2、对象.实例方法
        // study(); // 报错的
        Student s = new Student();
        s.name = "全蛋儿";
        s.study();

        // 3、对象.静态方法(不推荐)
        s.getMax(300,20);
    }
}








