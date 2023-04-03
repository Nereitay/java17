package com.itheima.d5_integer;

/**
    目标：明白包装类的概念，并使用。

 其实就是8种基本数据类型对应的引用类型

 为什么提供包装类？
 - Java为了实现一切皆对象，为8种基本类型提供了对应的引用类型。
 - 后面的集合和泛型其实也只能支持包装类型，不支持基本数据类型。

 */
public class Test {
    public static void main(String[] args) {
        int a = 10;
        Integer a1 = 11;
        Integer a2 = a; // 自动装箱
        System.out.println(a);
        System.out.println(a1);

        Integer it = 100;
        int it1 = it; // 自动拆箱
        System.out.println(it1);

        double db = 99.5;
        Double db2 = db; // 自动装箱了
        double db3 = db2; // 自动拆箱
        System.out.println(db3);

        // int age = null; // 报错了！
        Integer age1 = null; //包装类型容错率更高
        Integer age2 = 0;

        System.out.println("-----------------");
        /*
        1、包装类可以把基本类型的数据转换成字符串形式。（没啥用）
         */
        Integer i3 = 23;
        String rs = i3.toString();
        System.out.println(rs + 1);

        String rs1 = Integer.toString(i3);
        System.out.println(rs1 + 1);

        /*
        可以直接+字符串得到字符串类型
         */
        String rs2 = i3 + "";
        System.out.println(rs2 + 1);

        System.out.println("-----------------");

        String number = "23";
        //转换成整数
         int age = Integer.parseInt(number);
//        int age = Integer.valueOf(number);
        System.out.println(age + 1);

        String number1 = "99.9";
        //转换成小数
        double score = Double.parseDouble(number1);
//        double score = Double.valueOf(number1);
        System.out.println(score + 0.1);
    }
}
