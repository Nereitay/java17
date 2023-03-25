package com.itheima.d4_jdk8_time;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * LocalDate
 *
 * 从Java 8开始，java.time包提供了新的日期和时间API
 * 新API的类型几乎全部是不变类型（和String的使用类似），可以放心使用不必担心被修改
 */
public class Demo01LocalDate {
    public static void main(String[] args) {
        localDateApi();

//        testConversion(19870314);
    }

    private static void localDateApi() {
        // 1、获取本地日期对象。
        LocalDate nowDate = LocalDate.now();
        System.out.println("今天的日期：" + nowDate);//今天的日期：

        int year = nowDate.getYear();
        System.out.println("year：" + year);


        int month = nowDate.getMonthValue();
        System.out.println("month：" + month);

        int day = nowDate.getDayOfMonth();
        System.out.println("day：" + day);

        //当年的第几天
        int dayOfYear = nowDate.getDayOfYear();
        System.out.println("dayOfYear：" + dayOfYear);

        //星期
        System.out.println(nowDate.getDayOfWeek());
        System.out.println(nowDate.getDayOfWeek().getValue());

        //月份
        System.out.println(nowDate.getMonth());//AUGUST
        System.out.println(nowDate.getMonth().getValue());//8

        System.out.println("------------------------");
        LocalDate bt = LocalDate.of(1991, 11, 11);
        System.out.println(bt);//直接传入对应的年月日
        System.out.println(LocalDate.of(1991, Month.NOVEMBER, 11));//相对上面只是把月换成了枚举
    }

    private static void testConversion(int date) {
        int day = date % 100;
        int month = date % 10000 / 100;
        int year = date / 10000;

        LocalDate localDate = LocalDate.of(year, month, day);
        System.out.println(localDate);
    }
}
