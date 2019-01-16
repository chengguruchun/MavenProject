package com.cheng.Redis;

import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by cheng on 2018/4/23.
 */
public class Test {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println("链接成功");
        System.out.println(jedis.ping());
        jedis.set("lccc", "opopop");
        System.out.println(jedis.get("lccc"));
        //
        jedis.lpush("site-list", "lk");
        jedis.lpush("site-list", "ppp");
        jedis.lpush("site-list", "nm");
        List<String> list = jedis.lrange("site-list", 0, 1);
        System.out.println(list.size());
        Set<String> keys = jedis.keys("*");
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        jedis.close();
    }
}
