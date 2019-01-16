package com.cheng.Aop;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 18:12 2018/5/18
 * @Reference:
 */
public class RailwayStation implements TicketService {

    public void sellTicket(){
        System.out.println("售票............");
    }

    public void inquire() {
        System.out.println("问询.............");
    }

    public void withdraw() {
        System.out.println("退票.............");
    }
}
