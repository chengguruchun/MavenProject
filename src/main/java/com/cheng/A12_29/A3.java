package com.cheng.A12_29;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 10:38 2019/1/6
 * @Reference:
 */
public class A3 {

    public static void main(String[] args) {
        String s = null;
        System.out.println(s);
        System.out.println(getNext());
        System.out.println(i);
    }
    private static int i = 1;
    public static int getNext() {
        return i++;
    }

}