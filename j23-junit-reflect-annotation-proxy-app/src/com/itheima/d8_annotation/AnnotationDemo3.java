package com.itheima.d8_annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 注解的解析
 *  - 注解的操作中经常需要进行解析，注解的解析就是判断是否存在注解，存在注解就解析出内容
 * 与注解解析相关的接口
 *  - Annotation: 注解的顶级接口，注解都是Annotation类型的对象
 *  - AnnotatedElement:该接口定义了与注解解析相关的解析方法
 *      所有的类成分Class, Method , Field , Constructor，都实现了AnnotatedElement接口他们都拥有解析注解的能力
 * 解析注解的技巧
 *  - 注解在哪个成分上，我们就先拿哪个成分对象。
 *      - 比如注解作用成员方法，则要获得该成员方法对应的Method对象，再来拿上面的注解
 *      - 比如注解作用在类上，则要该类的Class对象，再来拿上面的注解
 *      - 比如注解作用在成员变量上，则要获得该成员变量对应的Field对象，再来拿上面的注解
 *
   目标：完成注解的解析
 */
public class AnnotationDemo3 {
    @Test
    public void parseClass(){
        /*
         a.先得到类对象
         */
        Class c = BookStore.class;
        /*
         b.判断这个类上面是否存在这个注解
         */
        if(c.isAnnotationPresent(Bookk.class)){
            /*
            c.直接获取该注解对象
             */
            Bookk book = (Bookk) c.getDeclaredAnnotation(Bookk.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.author()));
        }
    }

    @Test
    public void parseMethod() throws NoSuchMethodException {
        // a.先得到类对象
        Class c = BookStore.class;

        // b.获取类中方法
        Method m = c.getDeclaredMethod("test");

        // c.判断这个方法上面是否存在这个注解
        if(m.isAnnotationPresent(Bookk.class)){
            //d.直接获取该注解对象
            Bookk book = (Bookk) m.getDeclaredAnnotation(Bookk.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.author()));
        }
    }
}

@Bookk(value = "《情深深雨濛濛》", price = 99.9, author = {"琼瑶", "dlei"})
class BookStore{

    @Bookk(value = "《三少爷的剑》", price = 399.9, author = {"古龙", "熊耀华"})
    public void test(){
    }
}

