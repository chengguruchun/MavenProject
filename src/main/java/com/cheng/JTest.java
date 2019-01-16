package com.cheng;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 20:30 2018/10/15
 * @Reference:
 */
public class JTest {
    @Test
    public void testYeepay(){
        String obj1 = "junit";
        String obj2 = "junit";
        String obj3 = "test";
        String obj4 = "test";

        System.out.println("用@Test标示测试方法！");
        //Assert.assertFalse(1 == 1);
        int[] arithmetic1 = { 1, 2, 3 };
        int[] arithmetic2 = { 1, 2, 2 };
        //Assert.assertArrayEquals(arithmetic1, arithmetic2);

        Assert.assertEquals(obj1, obj2);
        //HashMap
        Assert.assertSame(obj3, obj4);
        String obj5 = null;
        Assert.assertNull(obj5);
        //Hashtable
    }

   /* @AfterClass
    public static void paylus(){
        System.out.println("用@AfterClass标示的方法在测试用例类执行完之后！");
    }*/


}