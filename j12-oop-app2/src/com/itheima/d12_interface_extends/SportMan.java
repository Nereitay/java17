package com.itheima.d12_interface_extends;

/**
 * 接口和接口的关系：多继承，一个接口可以同时继承多个接口
 *
 * 接口多继承的作用
 *  规范合并，整合多个接口为同一个接口，便于子类实现
 */
public interface SportMan extends Law, People {
    void run();
    void competition();
}
