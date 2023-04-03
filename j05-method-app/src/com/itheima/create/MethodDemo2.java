package com.itheima.create;

/**
 *  目标：学习方法的完整定义格式，并理解其调用和执行流程
 */
public class MethodDemo2 {

    public static void main(String[] args) {
        int rs = add(100, 200);
        System.out.println("和是：" + rs);

        System.out.println("-----------------");
        int rs1 = add(200, 300);
        System.out.println("和是：" + rs1);

    }
    /*修饰符      返回值类型  方法名称  形参列表*/
    public static int add(int a, int b){
        int c = a + b;
        return c;
    }
}
