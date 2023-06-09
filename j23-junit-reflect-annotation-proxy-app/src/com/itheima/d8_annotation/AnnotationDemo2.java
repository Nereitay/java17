package com.itheima.d8_annotation;

/**
 * 元注解
 *      - 元注解：就是注解注解的注解。
 * 元注解常见有两个：
 *      - @Target: 约束自定义注解只能在哪些地方使用，
 *          -> @Target中可使用的值定义在ElementType枚举类中，常用值如下:
 *              TYPE，类，接口
 *              FIELD, 成员变量
 *              METHOD, 成员方法
 *              PARAMETER, 方法参数
 *              CONSTRUCTOR, 构造器
 *              LOCAL_VARIABLE, 局部变量
 *      - @Retention：申明注解的生命周期
 *          -> @Retention中可使用的值定义在RetentionPolicy枚举类中，常用值如下
 *              SOURCE： 注解只作用在源码阶段，生成的字节码文件中不存在
 *              CLASS：  注解作用在源码阶段，字节码文件阶段，运行阶段不存在，默认值.
 *              RUNTIME：注解作用在源码阶段，字节码文件阶段，运行阶段（开发常用）
   目标：认识元注解
 */
//@MyTest // 只能注解方法和成员变量
public class AnnotationDemo2 {

    @MyTest
    private String name;

    @MyTest
    public void test(){

    }

    public static void main(String[] args) {

    }
}
