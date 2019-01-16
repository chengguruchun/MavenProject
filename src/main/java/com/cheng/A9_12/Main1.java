package com.cheng.A9_12;

import java.util.ArrayList;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 10:59 2018/9/27
 * @Reference:
 */
public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            l.add(String.valueOf(i));
        }
        l.stream().filter(e -> !e.equals("5")).forEach(System.out::print);

    }
}