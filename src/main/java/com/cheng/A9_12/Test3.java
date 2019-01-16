package com.cheng.A9_12;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/**
 * @Author :cheng
 * @Description:
 * @Date: created in 10:40 2018/10/15
 * @Reference:
 */
public class Test3 {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        Set set1 = Collections.synchronizedSet(set);

        CopyOnWriteArraySet<String> s = new CopyOnWriteArraySet<>();


    }

}