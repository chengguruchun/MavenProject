package com.cheng.base;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 15:50 2018/8/18
 * @Reference:
 */
public class Java8Tester {

    public static void main(String args[]){
        List names = new ArrayList();

        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");

        names.forEach(System.out::println);
    }
}