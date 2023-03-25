package com.itheima.string;

/**
    目标：String类创建字符串对象的2种方式
 */
public class StringDemo2 {
    public static void main(String[] args) {
        // 方式一：直接使用双引号得到字符串对象
        /*以 “ ” 方式给出的字符串对象，在字符串常量池中存储 ，而且相同内容只会在其中存储一份*/
        String name = "我爱你中国";
        System.out.println(name);

        // 方式二：通过构造器new对象 ，每new一次都会产生一个新对象 ，放在堆内存中
        // 1、public String(): 创建一个空白字符串对象，不含有任何内容 （几乎不用）
        String s1 = new String(); // s1 = ""
        System.out.println(s1);

        // 2、public String(String): 根据传入的字符串内容，来创建字符串对象（几乎不用）
        String s2 = new String("我是中国人");
        System.out.println(s2);

        // 3、public String(char[] c): 根据字符数组的内容，来创建字符串对象
        char[] chars = {'a' , 'b' , '中', '国'};
        String s3 = new String(chars);
        System.out.println(s3);

        // 4、public String(byte[] b):  根据字节数组的内容，来创建字符串对象
        byte[] bytes = {97, 98, 99, 65, 66, 67};
        String s4 = new String(bytes);
        System.out.println(s4);

        System.out.println("---------------------------------------");
        String ss1 = "abc";
        String ss2 = "abc";
        System.out.println(ss1 == ss2); // true

        char[] chars1 = {'a' , 'b' , 'c'};
        String ss3 = new String(chars1);
        String ss4 = new String(chars1);
        System.out.println(ss3 == ss4); // false
    }
}
