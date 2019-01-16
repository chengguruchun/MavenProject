package com.cheng.Thrift;

import org.apache.thrift.TException;

/**
 * Created by cheng on 2018/4/28.
 */
public class HelloServiceImpl implements Hello.Iface{
    public String helloString(String para) throws TException {

        return "result:" + para;
    }
}
