package com.itheima.d4_decorator_pattern;

/**
 * 什么是装饰设计模式
 *  - 创建一个新类，包装原始类，从而在新类中提升原来类的功能
 * 装饰设计模式的作用
 *  - 作用：装饰模式指的是在不改变原类的基础上, 动态地扩展一个类的功能
 *      InputStream(抽象父类)
 *      FileInputStream(实现子类，读写性能较差)
 *      BufferedInputStream(实现子类，装饰类，读写性能高)
 *      1. 定义父类。
 *      2. 定义原始类，继承父类，定义功能。
 *      3. 定义装饰类，继承父类，包装原始类，增强功能！！
   装饰类：继承InputStream 拓展原始类的功能
 */
public class BufferedInputStream extends InputStream{
    private InputStream is;

    /*
    包装原始类
     */
    public BufferedInputStream(InputStream is){
        this.is = is;
    }
    @Override
    public int read() {
        System.out.println("提供8KB的缓冲区，提高读数据性能~~~~");
        return is.read();
    }

    @Override
    public int read(byte[] buffer) {
        System.out.println("提供8KB的缓冲区，提高读数据性能~~~~");
        return is.read(buffer);
    }
}
