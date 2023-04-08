package com.itheima.d8_annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * 模拟Junit框架
 * 需求
 *      - 定义若干个方法，只要加了MyTest注解，就可以在启动时被触发执行
 * 分析
 *      - 定义一个自定义注解MyTest，只能注解方法，存活范围是一直都在。
 *      - 定义若干个方法，只要有@MyTest注解的方法就能在启动时被触发执行，没有这个注解的方法不能执行
 */
public class AnnotationDemo4 {
    public void test1(){
        System.out.println("===test1===");
    }

    @MyTest
    public void test2(){
        System.out.println("===test2===");
    }

    @MyTest
    public void test3(){
        System.out.println("===test3===");
    }

    /*
      启动菜单：有注解的才被调用。
     */
    public static void main(String[] args) throws Exception {
        AnnotationDemo4 t = new AnnotationDemo4();
        // a.获取类对象
        Class c = AnnotationDemo4.class;
        // b.提取全部方法
        Method[] methods = c.getDeclaredMethods();
        // c.遍历方法，看是否有MyTest注解，有就跑它
        for (Method method : methods) {
            if(method.isAnnotationPresent(MyTest.class)){
                // 跑它 -> 需要有对象触发
                method.invoke(t);
            }
        }
    }
}
