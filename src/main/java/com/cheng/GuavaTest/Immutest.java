package com.cheng.GuavaTest;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.util.ArrayList;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 19:57 2018/5/27
 * @Reference:
 */
public class Immutest {
    public static void main(String[] args) {

        ImmutableList<String> immutableList = ImmutableList.of(
                "lcc", "opppo", "dsdfsd"
        );
        //immutableList.add("lsd");

        ArrayList<String> list = Lists.newArrayList("wo","bu","ke","bian");
        ImmutableList<String> list1 = ImmutableList.copyOf(list);
        list1.add("poopopp");
    }
}
