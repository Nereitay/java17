package com.itheima.overload;

/**
 *  目标：识别方法重载的形式。并理解其调用流程，最后需要知道使用方法重载的好处。
 *  同一个类中，出现多个方法名称相同，但是形参列表是不同的，那么这些方法就是重载方法
 */
public class MethodDemo1 {
    public static void main(String[] args) {
        fire();
        fire("岛国");
        fire("岛国", 1000);
    }

    public static void fire(){
        fire("米国");
    }

    public static void fire(String location){
        fire(location, 1);
    }

    public static void fire(String location, int number){
        System.out.println("默认发射"+number+"枚武器给"+location+"~~~");
    }
}
