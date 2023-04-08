package com.itheima.d8_annotation;

public @interface MyBook {
    /*
    默认public
     */
    public String name();
    String[] authors();
    double price();
}
