package com.itheima.d4_jdk8_time;

import java.time.LocalDate;
import java.time.Period;

/**
 * Period
 */
public class Demo07Period {
    public static void main(String[] args) {
        // 当前本地 年月日
        LocalDate today = LocalDate.now();
        System.out.println(today);//

        // 生日的 年月日
        LocalDate birthDate = LocalDate.of(1983, 9, 27);
        System.out.println(birthDate);

        Period period = Period.between(birthDate, today);//第二个参数减第一个参数

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}
