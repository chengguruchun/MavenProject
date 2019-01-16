package com.cheng.Aop;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 9:42 2018/7/27
 * @Reference:
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("hello!");
    }

    public void request1() {
        System.out.println("不是接口定义的方法！");
    }
}