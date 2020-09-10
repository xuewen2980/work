package com.itheima.day07.work;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

public class Demo7 {
/*
第七题.制定一个闹钟，闹钟时间从每天早上6点30分0秒开始闹铃，每隔5分钟再闹铃一次，一共闹铃10次闹钟自动停止。闹铃的代码实现如下：
请编写时间日期类，完成闹铃开始闹铃的代码
 */
    public static void main(String[] args) {
        //获取现在的时间
        LocalTime now = LocalTime.now();
        LocalTime of = LocalTime.of(6, 30, 0);
        //获取时间间隔秒数
        Duration duration = Duration.between(now,of);
        long delay = Math.abs(duration.getSeconds())*1000;//与6点半的间隔毫秒数,
        long period = 60*5*1000;//5分钟间隔

        //定时任务对象
        Timer timer = new Timer();
        //定时任务方法
        timer.scheduleAtFixedRate(new TimerTask() {
            int count=0;
            @Override
            public void run() {
                count++;
                method(count);
                //闹钟响了10次自动停止
                if (count==10)timer.cancel();

            }
        },delay,period);
        //delay 延迟加载  1000：代表延迟一秒执行
        //period 周期，1000：每一秒执行一次


    }

    public static void method(int count){
        System.out.println("我是一个小闹钟！！响了"+count+"次");
    }
}
