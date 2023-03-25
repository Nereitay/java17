package com.itheima.d6_innerclass_nested;

/**
   外部类
 */
public class Outer {
    public static int num = 111;
    private String hobby;

    public Outer() {
    }

    public Outer(String hobby) {
        this.hobby = hobby;
    }

    /**
       成员内部类：
     成员内部类是什么样的、有什么特点？
        - 无static修饰，属于外部类的对象。
        - 可以直接访问外部类的静态成员，实例方法中可以直接访问外部类的实例成员。
     成员内部类如何创建对象？
        - 外部类名.内部类名 对象名 = new  外部类构造器.new 内部类构造器();
     */
    public class Inner{
        private String name;
        private int age;
        public static int a = 100; // JDK 16开始支持静态成员了

        public static void test(){
            System.out.println(a);
        }

        public void show(){
            System.out.println("名称：" + name);
            System.out.println("数量：" + num); // 直接访问外部类的静态成员
            /*
            因为必须先有外部类对象，才能有成员内部类对象，所以可以直接访问外部类对象的实例成员
             */
            System.out.println("爱好：" + hobby); // 直接访问外部类的实例成员
        }

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
}
