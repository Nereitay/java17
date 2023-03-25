package com.itheima.d5_innerclass_static;

/**
   外部类
 */
public class Outer {

    public static int a = 100;
    private String hobby;

    /**
     *学习静态成员内部类
     * <p>
     * 内部类就是定义在一个类里面的类，里面的类可以理解成（寄生），外部类可以理解成（宿主）
     * <p>
     * 内部类的使用场景、作用
     *      - 当一个事物的内部，还有一个部分需要一个完整的结构进行描述，而这个内部的完整的结构又只为外部事物提供服务，那么整个内部的完整结构可以选择使用内部类来设计。
     *      - 内部类通常可以方便访问外部类的成员，包括私有的成员。
     *      - 内部类提供了更好的封装性，内部类本身就可以用private protected等修饰，封装性可以做更多控制。
     *
     * 内部类分类
     *      - 静态内部类 Static nested classes
     *      - 成员内部类 Nested Inner class
     *      - 局部内部类 Method local inner classes
     *      - 匿名内部类 Anonymous inner classes （重点）
     */
    public static class Inner{
        private String name;
        private int age;
        public static String schoolName;

        public Inner(){}

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void show(){
            System.out.println("名称：" + name);
            System.out.println(a);// 直接访问外部类的静态成员
            // System.out.println(hobby); // 报错！不可以访问外部类的实例成员变量
//            Outer o = new Outer();
//            System.out.println(o.hobby); // 外部类的实例成员必须用外部类对象访问
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

    /*
    静态内部类的使用场景、特点、访问总结。
        - 如果一个类中包含了一个完整的成分，如汽车类中的发动机类。
        - 特点、使用与普通类是一样的，类有的成分它都有，只是位置在别人里面而已。
        - 可以直接访问外部类的静态成员，不能直接访问外部类的实例成员。
        - 注意：开发中实际上用的还是比较少。
     */


}
