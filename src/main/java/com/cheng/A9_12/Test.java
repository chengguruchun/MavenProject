package com.cheng.A9_12;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 15:12 2018/9/14
 * @Reference:
 */
public class Test{
    private static int i=1;
    public int getNext(){
        return i++;
    }
    public static void main(String [] args){
        Test test=new Test();
        Test testObject=new Test();
        test.getNext();
        testObject.getNext();
        System.out.println(testObject.getNext());
        int j = 9;
        System.out.println(j++);
        System.out.println(j);
    }
}