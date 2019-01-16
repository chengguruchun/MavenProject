package com.cheng.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 16:05 2018/5/24
 * @Reference: https://blog.csdn.net/wwzuizz/article/details/54289195
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/*.application.xml");
        TestDemo demo = (TestDemo) context.getBean("bean1");
        demo.add();
    }
}
