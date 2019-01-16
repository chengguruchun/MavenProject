package com.cheng.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 10:53 2018/6/27
 * @Reference:
 */
public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 20; i++) {
            map.put(i, "Python" + i);
        }

    }
}