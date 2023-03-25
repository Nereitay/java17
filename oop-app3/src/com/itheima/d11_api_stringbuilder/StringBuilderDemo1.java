package com.itheima.d11_api_stringbuilder;

/**
    目标：学会使用StringBuilder操作字符串,最终还需要知道它性能好的原因
        - StringBuilder是一个可变的字符串类，我们可以把它看成是一个对象容器。
    作用：提高字符串的操作效率，如拼接、修改等

    为什么拼接、反转字符串建议使用StringBuilder?
        - String ：内容是不可变的、拼接字符串性能差。
        - StringBuilder：内容是可变的、拼接字符串性能好、代码优雅。

    定义字符串使用String
    拼接、修改等操作字符串使用StringBuilder

 */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // ""
        sb.append("a");
        sb.append("b");
        sb.append("c");
        sb.append(1);
        sb.append(false);
        sb.append(3.3);
        sb.append("abc");
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder();
        // 支持链式编程
        sb1.append("a").append("b").append("c").append("我爱你中国");
        System.out.println(sb1);

        // 反转
        sb1.reverse().append("110");
        System.out.println(sb1);

        System.out.println(sb1.length());

        // 注意：StringBuilder只是拼接字符串的手段：效率好。
        // 最终的目的还是要恢复成String类型。
        StringBuilder sb2 = new StringBuilder();
        sb2.append("123").append("456");
        // 恢复成String类型
        String rs = sb2.toString();
        print(rs);
    }

    public static void print(String data){
        System.out.println(data);
    }
}
