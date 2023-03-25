package com.itheima.d6_innerclass_nested;

public class Test {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.setName("内部");
        in.show();
        Outer.Inner.test();

        System.out.println("------------");
        Outer.Inner in1 = new Outer("爱听课").new Inner();
        in1.show();
    }
}
