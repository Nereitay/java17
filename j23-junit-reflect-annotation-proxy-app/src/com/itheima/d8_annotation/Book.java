package com.itheima.d8_annotation;

public @interface Book {
    /*
    特殊属性
     */
    String value();
    double price() ;
    //double price() default 9.9;
}
