package com.itheima.param;

/**
 *  理解Java的基本类型的参数传递：值传递 => 传输的是实参存储的值。
 *
 */
public class MethodDemo1 {
    public static void main(String[] args) {
        // 实参：如在方法内部定义的变量。
        int a = 10;
        /*
        在传输实参给方法的形参的时候，并不是传输实参变量本身，
        而是传输实参变量中存储的值，这就是值传递
         */
        change(a); //形参：如在定义方法时，“()”中所声明的参数
        System.out.println(a); // 10
    }

    public static void change(int a){
        System.out.println(a); // 10
        a = 20;
        System.out.println(a); // 20
    }

}
