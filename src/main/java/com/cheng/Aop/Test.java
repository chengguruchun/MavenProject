package com.cheng.Aop;

import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.ProxyFactoryBean;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 18:14 2018/5/18
 * @Reference:
 */
public class Test {
    public static void main(String[] args) {
        //1.针对不同的时期类型，提供不同的Advice
        Advice beforeAdvice = new TicketServiceBeforeAdvice();
        Advice afterReturningAdvice = new TicketServiceAfterReturningAdvice();
        Advice aroundAdvice = new TicketServiceAroundAdvice();
        Advice throwsAdvice = new TicketServiceThrowsAdvice();

        RailwayStation railwayStation = new RailwayStation()
;
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setInterfaces(TicketService.class);
        proxyFactoryBean.setTarget(railwayStation);
        proxyFactoryBean.setProxyTargetClass(true);
        proxyFactoryBean.addAdvice(afterReturningAdvice);
        proxyFactoryBean.addAdvice(aroundAdvice);
        proxyFactoryBean.addAdvice(throwsAdvice);
        proxyFactoryBean.addAdvice(beforeAdvice);
        proxyFactoryBean.setProxyTargetClass(false);

        TicketService service = (TicketService) proxyFactoryBean.getObject();
        service.sellTicket();
    }
}
