package com.itheima.d9_abstract_template.after;

public class Test {
    public static void main(String[] args) {
//        accountTest();

        articleTest();
    }

    private static void accountTest() {
        CurrentAccount acc = new CurrentAccount("ICBC-111", 100000);
        acc.handle("itheima", "123456");
    }

    private static void articleTest() {
        Pupils pupils = new Pupils();
        pupils.write();
    }
}
