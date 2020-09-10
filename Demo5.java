package com.itheima.day07.work;
//请查找API，查找Duration时间间隔对象的方法，算出6点30分00秒 和22点18分55秒之间间隔了多少秒

import java.time.Duration;
import java.time.LocalDateTime;

public class Demo5 {
    //请查找API，查找Duration时间间隔对象的方法，算出6点30分00秒 和22点18分55秒之间间隔了多少秒
    public static void main(String[] args) {
        LocalDateTime time1 = LocalDateTime.of(2000, 11, 11, 6, 30, 0);
        LocalDateTime time2 =LocalDateTime.of(2000,11,11,22,18,55);
        Duration duration = Duration.between(time1, time2);
        long seconds = Math.abs(duration.getSeconds());
        System.out.println("6点30分00秒和22点18分55秒之间间隔了"+seconds+"秒");
    }
}
