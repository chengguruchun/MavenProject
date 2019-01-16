package com.cheng.json;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 15:30 2018/10/3
 * @Reference:
 */

import com.alibaba.fastjson.JSON;

public class Foo {
    //有set/get方法
    private String prop1;

    //有操作概属性的方法，但不是set/get方法
    private String prop2;

    //没有方法直接操作这个属性，由构造函数传入
    private String prop3;

    private boolean prop4;

    public Foo() {

    }

    public Foo(String prop1, String prop2, String prop3, boolean prop4) {
        this.prop1 = prop1;
        this.prop2 = prop2;
        this.prop3 = prop3;
        this.prop4 = prop4;
    }

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public String popProp2() {
        return prop2;
    }

    public void pushProp2(String prop2) {
        this.prop2 = prop2;
    }

    //增加了打印，便于了解调用了哪个函数
    public boolean isProp4() {
        System.out.println("invoke isProp4()");
        return prop4;
    }

    public boolean getProp4() {
        System.out.println("invoke getProp4()");
        return prop4;
    }


    //没有对应属性，只有get方法
    public String getProp5() {
        return "4";
    }

    //没有对应属性，有一个is方法
    public boolean isProp6() {
        return true;
    }


    public static void main(String[] args) {
        Foo f = new Foo("1", "2", "3", false);

        String text = JSON.toJSONString(f);
        System.out.println(text);
    }
}