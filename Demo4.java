package com.itheima.day07.work;

import java.time.LocalDate;
import java.time.Period;

//请查找API，查找Period日期间隔对象的方法，算出 2000年1月1日 和1998年12月12日之间间隔了多少年，多少天，多少日
public class Demo4 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2000,1,1);
        LocalDate ld2 = LocalDate.of(1998, 12, 12);
        Period cha = Period.between(ld1, ld2);
        int year = Math.abs(cha.getYears());
        int month = Math.abs(cha.getMonths());
        int day = Math.abs(cha.getDays());
        System.out.println("2000年1月1日和1998年12月12日之间隔了"+year+"年,"+month+"个月,"+day+"天");

    }
}
