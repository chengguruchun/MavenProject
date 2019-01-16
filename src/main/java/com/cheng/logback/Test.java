package com.cheng.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 14:24 2018/6/23
 * @Reference:
 */
public class Test {
    private static final Logger LOGGER = LoggerFactory.getLogger(Test.class);
    public static void main(String[] args) {
        LOGGER.info("hello -{}", "lcc");
    }
}