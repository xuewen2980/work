package com.itheima.day07.work;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeOutOfBoundsException{

        this.age = age;
    }

    public Student(String name, int age) throws AgeOutOfBoundsException{
        if (!(age>=18&&age<=26)) {
            throw new AgeOutOfBoundsException("年龄范围需在18-26之间,age:" + age);
        }
        this.name=name;
        this.age=age;

    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
