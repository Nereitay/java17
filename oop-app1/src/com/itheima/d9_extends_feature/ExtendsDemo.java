package com.itheima.d9_extends_feature;

/**
 * 继承特点
 * 1.子类可以继承父类的属性和行为，但是子类不能继承父类的构造器。
 * 2.Java是单继承模式：一个类只能继承一个直接父类。
 * 3.Java不支持多继承、但是支持多层继承。
 * 4.Java中所有的类都是Object类的子类。
 */
public class ExtendsDemo {
    public static void main(String[] args) {
        /*
            子类是否可以继承私有的属性和行为呢？我认为可以的 只是不能直接访问
         */
        Student s = new Student();
        /*
            子类是否可以继承父类的静态成员？子类可以直接使用父类的静态成员（共享）但个人认为：子类不能继承父类的静态成员。（共享并非继承）
         */
        String location1 = s.location;
        String location2 = Student.location;

//        System.out.println(s.age);
//        s.run();
    }
}

class C extends A{

}

class A{

}

class B{

}

class People{
    private int age = 21;
    public static String location = "Madrid";
    private void run(){
        System.out.println("人跑的很快~~");
    }
}

class Student extends People{

}