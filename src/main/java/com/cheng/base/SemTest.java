package com.cheng.base;

import java.util.concurrent.Semaphore;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 19:01 2018/9/8
 * @Reference:
 */
public class SemTest {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        new Thread(() -> {
            try {
                if (semaphore.tryAcquire(3)) {
                    System.out.println(1);
                }else {
                    System.out.println(2);
                }
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }

        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(200);
                if (semaphore.tryAcquire())
                    System.out.println(3);
                else
                    System.out.println(4);
            } catch (InterruptedException e) {

            }
        }).start();
    }
}