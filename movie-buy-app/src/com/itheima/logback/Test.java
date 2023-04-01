package com.itheima.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 目标：快速搭建LogBack日志框架，记录程序的执行情况到控制台 / 到文件中
 */
public class Test {

    // 创建Logback的体质对象，代表了日志技术
    public static final Logger LOGGER = LoggerFactory.getLogger("Test.class"); //shift + F6 大写
    public static void main(String[] args) {
//        while (true) { //测试日志拆分
            try {
                LOGGER.debug("main方法开始执行日志了...");
                LOGGER.info("开始记录第二行日志，开始做除法...");
                int a = 10;
                int b = 0;
                LOGGER.trace("a = {}", a);
                LOGGER.trace("b = {}", b);

                System.out.println(a / b);
            } catch (Exception e) {
                e.printStackTrace();
                LOGGER.error("功能出现异常，" + e);
            }
//        }
    }
}
