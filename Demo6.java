package com.itheima.day07.work;

import java.util.Scanner;

public class Demo6 {
    //创建一个自定义异常类继承RuntimeException,实现两个构造方法，无参和带参(一个参数，参数类型为String)。
    // 并写出一个使用自定义异常的方法
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名:");
        String name =sc.next();
        Student student = null;
        while (true){
            try {
                System.out.println("请输入年龄:");
                String ageStr = sc.next();
                int age = Integer.parseInt(ageStr);
                student = new Student(name,age);
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("年龄请输入数字哦");
            }catch (AgeOutOfBoundsException e) {
                e.printStackTrace();
                System.out.println("请输入合适的年龄哦:");
            }
        }
        System.out.println(student);

    }


}
