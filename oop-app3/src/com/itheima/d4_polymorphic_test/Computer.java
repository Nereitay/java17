package com.itheima.d4_polymorphic_test;

/**
 * 多态案例
 */
public class Computer {
    /*
       提供一个安装的入口：行为。
     */
    public void installUSB(USB u){
        u.connect();

        // 独有功能
        if(u instanceof Mouse){
            Mouse m = (Mouse) u;
            m.click();
        }else if(u instanceof KeyBoard k) {
            k.keyDown();
        }

        u.unconnect();
    }
}
