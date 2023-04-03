package com.itheima.loop;

/**
 * 目标：学会使用doWhile循环，并理解其执行流程
 */
public class DoWhileDemo7 {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Hello World");
            i++;
        }while (i < 3);

        System.out.println("--------------------");

        //for循环中，控制循环的变量只在循环中可以使用。
        for (int j = 0; j < 3; j++) {
            System.out.println("Hello World");
        }
        for (int j = 0; j < 3; j++) {
            System.out.println("Hello World");
        }

        // While循环中，控制循环的变量在循环后还可以继续使用。
        int n = 0;
        while (n < 3){
            System.out.println("Hello World");
            n++;
        }
        System.out.println(n);
    }
}
