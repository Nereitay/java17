package com.itheima.d3_static_test;

import java.util.Random;

/**
 * 工具类
 *  定义的都是一些静态方法，每个方法都是以完成一个共用的功能为目的
 *  一是调用方便，二是提高了代码复用
 *  实例方法需要创建对象调用，此时用对象只是为了调用方法，这样只会浪费内存
 * 工具类要求：
 * - 建议工具类的构造器私有化处理
 * - 工具类不需要创建对象
 */
public class VerifyTool {
    /*
       私有构造器
     */
    private VerifyTool() {
    }

    /**
     * 静态方法
     */
    public static String createCode(int n) {
        // 1、使用String开发一个验证码
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        // 2、定义一个变量用于存储5位随机的字符作为验证码
        String code = "";
        // 3、循环
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(chars.length());
            // 4、对应索引提取字符
            code += chars.charAt(index);
        }
        return code;
    }
}
