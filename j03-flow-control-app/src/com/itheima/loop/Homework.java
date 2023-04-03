package com.itheima.loop;


public class Homework {

    public static void main(String[] args) {
//        narcissisticNumbers();

//        foldEverest();

//        nestedLoopBreak();

        nestedLoopContinue();
    }

    private static void narcissisticNumbers() {
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int unit = i % 10;
            int tens = i / 10 % 10;
            int hundreds = i / 100;

            if (unit * unit * unit + tens * tens * tens + hundreds * hundreds * hundreds == i) {
                System.out.print(i + "\t");
                count++;
            }
        }

        System.out.println();
        System.out.println("水仙花个数是：" + count);
    }

    private static void foldEverest() {
        double paperThickness = 0.1;
        int everestHeight = 8848860;
        int count = 0;
        while (paperThickness < everestHeight) {
//            paperThickness = paperThickness * 2;
            paperThickness *= 2;
            count++;
        }

        System.out.println("折叠次数为：" + count);
        System.out.println("纸张最终厚度为：" + paperThickness);
    }

    private static void nestedLoopBreak() {
        OUT:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println("statement...");
                if (i == 2 && j == 3) {
                    break OUT; // 指定跳出外部循环，并结束外部循环了！
                }
            }
            System.out.println("--------------------");
        }
    }

    private static void nestedLoopContinue() {
        OUT:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println("statement...");
                if (i == 2 && j == 3) {
                    continue OUT; // 可以指定结束外部循环的当次执行，进入外部循环的下一次执行
                }
            }
            System.out.println("--------------------");
        }
    }
}
