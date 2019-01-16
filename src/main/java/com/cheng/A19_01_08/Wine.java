package com.cheng.A19_01_08;

/**
 * @Author :cheng
 * @Description: 多态
 * @Date: created in 14:44 2019/1/9
 * @Reference:
 */
public class Wine {
    public void fun1() {
        System.out.println("wine de  fun...");
        fun2();
    }

    public void fun2() {
        System.out.println("wine de fun2");

    }
}

class JNC extends Wine {
    public void fun1() {
        System.out.println("jnc de fun1...");
        fun2();
    }

    public void fun2() {
        System.out.println("jnc de fun2.....");
    }

    public static void main(String[] args) {
        Wine a = new JNC();
        a.fun1();
    }
}