package com.itheima.d12_extends_constructor;

/**
 * 继承后：子类构造器的特点
 *  子类中所有的构造器默认都会先访问父类中无参的构造器，再执行自己
 * 为什么？
 *  子类在初始化的时候，有可能会使用到父类中的数据，如果父类没有完成初始化，子类将无法使用父类的数据。
 *  子类初始化之前，一定要调用父类构造器先完成父类数据空间的初始化。
 *怎么调用父类构造器的？
 *  子类构造器的第一行语句默认都是：super()，不写也存在
 */
public class Cat extends Animal{
    public Cat(){
        super(); // 默认的，写不写都有，默认就是找父类无参数构造器
        System.out.println("==子类Cat无参数构造器被执行===");
    }

    public Cat(String n){
        super(); // 默认的，写不写都有，默认就是找父类无参数构造器
        System.out.println("==子类Cat有参数构造器被执行===");
    }
}
