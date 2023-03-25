package com.itheima.returndemo;

/**
 * 目标：明确return关键字的作用。
 */
public class ReturnDemo {
    public static void main(String[] args) {
        System.out.println("main开始。。");
        chu(10 , 0);
        System.out.println("main结束。。");
    }

    /*
    return;    --->    可以立即跳出并结束当前方法的执行;   return关键字单独使用可以放在任何方法中
     */
    public static void chu(int a, int b){
        if(b == 0){
            System.out.println("您输入的数据有问题，除数不能是0！！");
            return; // 立即跳出当前方法，并结束当前方法的执行。
        }

        int c = a / b;
        System.out.println("结果是：" + c);
    }
}
