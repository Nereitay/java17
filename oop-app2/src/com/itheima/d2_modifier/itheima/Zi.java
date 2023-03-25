package com.itheima.d2_modifier.itheima;


import com.itheima.d2_modifier.itcast.Fu;

public class Zi extends Fu {
    public static void main(String[] args) {
        // 父类对象无法访问protected， 这是专门给子类用的
        /*Fu fu = new Fu();
        fu.show3();*/
        //创建Zi的对象，测试看有哪些方法可以使用
        Zi z = new Zi();
        z.show3();
        z.show4();
    }

}
