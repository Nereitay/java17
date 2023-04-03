package com.itheima.d6_abstract_class;

public class Tiger extends Animal{
    /*
    一个类如果继承了抽象类，那么这个类必须重写完抽象类的全部抽象方法，否则这个类也必须定义成抽象类
     */
    @Override
    public void run() {
        System.out.println("老虎跑的贼溜~~~~");
    }
}
