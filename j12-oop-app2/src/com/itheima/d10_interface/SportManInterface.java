package com.itheima.d10_interface;

/**
   接口
    - 接口中的成员：JDK 1.8之前只有常量 和 抽象方法
    - 接口不能实例化。
    - 接口中的成员都是public修饰的，写不写都是，因为规范的目的是为了公开化
 */
public interface SportManInterface {

    // public static final 可以省略不写，接口默认会为你加上！
    // public static final String SCHOOL_NAME = "黑马";
    /*
        1.常量
     */
    String SCHOOL_NAME = "黑马";

    /*
        2、抽象方法
     */
    //  public abstract 可以省略不写，接口默认会为你加上！
    // public abstract void run();
    void run();

    // public abstract void eat();
    void eat();
}
