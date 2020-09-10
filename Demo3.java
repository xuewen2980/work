package com.itheima.day07.work;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo3 {
    //使用LocalDateTime对象创建日期对象，并且把时间对象转换为字符串对象。格式为为1999年12月12日 12点12分12秒
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(1999,12,12,12,12,12);
        String format = ldt.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH点mm分ss秒"));
        System.out.println(format);
    }
}
