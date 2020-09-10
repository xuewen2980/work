package com.itheima.day07.work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo2 {
    //使用SimpleDateFormat对象完成 字符串和Date对象的互相转换
    public static void main(String[] args) throws ParseException {
        String birthday = "1999年11月12日 19:24:56";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //解析字符串为时间对象
        Date parse = sdf.parse(birthday);
        System.out.println(parse);

        //将时间对象转换成字符串展示
        String format = sdf.format(parse);
        System.out.println(format);

    }
}
