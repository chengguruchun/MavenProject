package com.cheng.Aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 9:43 2018/7/27
 * @Reference:
 */
public class SubjectHandler implements InvocationHandler{
    private Subject subject;

    public SubjectHandler(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("预处理");
        Object obj = method.invoke(subject, args);
        System.out.println("后处理");
        return obj;
    }

    public static void main(String[] args) {
        Subject s = new RealSubject();
        InvocationHandler handler = new SubjectHandler(s);
        ClassLoader c1 = s.getClass().getClassLoader();
        Subject proxy = (Subject) Proxy.newProxyInstance(c1, s.getClass().getInterfaces(), handler);
        proxy.request();
        RealSubject s1 = (RealSubject) s;
        s1.request1();
        //proxy.request1();
        //Modifier.isFinal();
    }

}