package com.cheng.base;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 12:15 2018/9/5
 * @Reference:
 */


class Person{
    private String name = "Person";
    int age = 0;

    public static void main(String[] args) {
        Person p = new Child();
        System.out.println(p.name);
    }
}
public class Child extends Person{
    public String grade;
    public static void main(String[] args){
        Person p = new Child();
        //System.out.println(p.name);
        System.out.println(p.age);
    }
}