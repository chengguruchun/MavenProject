package com.cheng.base;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 10:04 2018/8/26
 * @Reference:
 */
public class Test {
    static boolean foo(char c) {
        System.out.print(c);
        return true;
    }

    public static void main(String[] argv) {
        int i = 0;
        for (foo('A'); foo('B') && (i < 2); foo('C')) {
            i++;
            foo('D');
        }
    }
}