package com.itheima.d8_annotation;

/**
 * 注解的作用是什么呢？
 *  - 对Java中类、方法、成员变量做标记，然后进行特殊处理，至于到底做何种处理由业务需求来决定。
 *      例如：JUnit框架中，标记了注解@Test的方法就可以被当成测试方法执行，而没有标记的就不能当成测试方法执行
 * 自定义注解 --- 格式
 *      public @interface 注解名称 {
 *          public 属性类型 属性名() default 默认值 ;
 *      }
 * 特殊属性
 *      - value属性，如果只有一个value属性的情况下，使用value属性的时候可以省略value名称不写!!
 *      - 但是如果有多个属性,  且多个属性没有默认值，那么value名称是不能省略的
   目标：学会自定义注解。掌握其定义格式和语法。
 */
@MyBook(name="《精通JavaSE》",authors = {"黑马", "dlei"} , price = 199.5)
//@Book(value = "/delete")
// @Book("/delete")
@Book(value = "/delete", price = 23.5)
//@Book("/delete")
public class AnnotationDemo1 {

    @MyBook(name="《精通JavaSE2》",authors = {"黑马", "dlei"} , price = 199.5)
    private AnnotationDemo1(){

    }

    @MyBook(name="《精通JavaSE1》",authors = {"黑马", "dlei"} , price = 199.5)
    public static void main(String[] args) {
        @MyBook(name="《精通JavaSE2》",authors = {"黑马", "dlei"} , price = 199.5)
        int age = 21;
    }
}

