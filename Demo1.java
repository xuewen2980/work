package com.itheima.day07.work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//根据当前日期，和自己的出生日期，请使用Date对象完成获取自己的年龄
public class Demo1 {
    public static void main(String[] args) throws ParseException {
        Date now = new Date();//获取现在的日期
        //出生日期
        String birthStr = "1999-9-9";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birth = sdf.parse(birthStr);
        long ageNum = now.getTime() - birth.getTime();
        long age = ageNum/(1000L*60*60*24*365);
        System.out.println(age);
    }
}
