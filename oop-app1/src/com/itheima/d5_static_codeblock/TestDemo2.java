package com.itheima.d5_static_codeblock;

/**
 *目标：学习构造代码块的特点、基本作用
 * 构造代码块（了解，用的少）每次创建对象，调用构造器执行时，都会执行该代码块中的代码，并且在构造器执行前执行
 *  使用场景：初始化实例资源
 */
public class TestDemo2 {

    private String name;

    /*
       属于对象的，与对象一起加载，自动触发执行。
     */
    {
        System.out.println("==构造代码块被触发执行一次==");
        name = "张麻子";
    }

    public TestDemo2(){
        System.out.println("==构造器被触发执行==");
    }

    public static void main(String[] args) {
        TestDemo2 t = new TestDemo2();
        System.out.println(t.name);

        TestDemo2 t1 = new TestDemo2();
        System.out.println(t1.name);
    }

}
