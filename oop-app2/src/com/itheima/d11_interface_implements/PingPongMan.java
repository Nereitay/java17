package com.itheima.d11_interface_implements;

/**
   实现类（子类）
 */
/*
    接口可以被类单实现，也可以被类多实现
 */
public class PingPongMan implements SportMan , Law{
    private String name;
    public PingPongMan(String name) {
        this.name = name;
    }

    /*
        一个类实现接口，必须重写完全部接口的全部抽象方法，否则这个类需要定义成抽象类
     */
    @Override
    public void rule() {
        System.out.println(name + "要遵章守法，不能随意外出，酗酒，约会~~~");
    }

    @Override
    public void run() {
        System.out.println(name + "必须要跑步训练~~");
    }

    @Override
    public void competition() {
        System.out.println(name + "需要参加国际比赛~~");
    }
}
