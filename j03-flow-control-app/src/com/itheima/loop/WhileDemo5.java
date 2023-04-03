package com.itheima.loop;

/**
 *  目标：学会使用while循环，并理解它的流程
 *
 *  知道循环几次：使用for；不知道循环几次建议使用：while
 *
 *  for循环中，控制循环的变量只在循环中可以使用。
 *  While循环中，控制循环的变量在循环后还可以继续使用
 */
public class WhileDemo5 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 3){
            System.out.println("Hello World");
            i++;
        }
        System.out.println("----------------------");
        int j = 0;
        while (j < 3){
            System.out.println("Hello World");
        }
    }
}
