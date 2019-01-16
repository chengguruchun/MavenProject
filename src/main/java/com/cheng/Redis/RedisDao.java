package com.cheng.Redis;

import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtostuffIOUtil;
import com.dyuproject.protostuff.runtime.RuntimeSchema;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.sound.midi.Track;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 15:40 2018/5/11
 * @Reference: http://www.cnblogs.com/javafucker/p/7559832.html
 */

/**
 * 六、查询redis时的逻辑
 伪代码：

 复制代码
 get from redis_cache              //首先查询redis
 if null                           //如果没有
    get from db                   //再从数据库db查询
        if null                       //如果仍然没有
        return null               //那么返回空
        else                          //否则
        put into redis_cache      //现将数据放入redis
        return obj                //再放回数据
 else                              //如果从redis中查询到了
    return obj                    //那么直接返回数据
 */
public class RedisDao {
    //redis连接池
    private final JedisPool jedisPool;//根据对象的字节码文件，生成空对象
    private RuntimeSchema<Object> schema = RuntimeSchema.createFrom(Object.class);  //Object.class：获取对象的字节码

    public RedisDao(String ip, int port){
        jedisPool = new JedisPool(ip, port);
    }

    public String putObject(Object obj) {
        try {
            Jedis jedis = jedisPool.getResource();
            try {
                String key = "object:" + obj.hashCode();
                //进行序列化
                byte[] bytes = ProtostuffIOUtil.toByteArray(obj, schema,
                        LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE)); //如果对象过大，会进行缓冲
                int timeout = 60 * 60;
                String result = jedis.setex(key.getBytes(), timeout, bytes);
                return result;
            } finally {
                jedis.close();
            }
            }catch (Exception e) {
                e.printStackTrace();
            }
            return null;
    }

    //从redis缓存中查询
    public Object getObject(long id){
        //redis操作逻辑
        try {
            Jedis jedis = jedisPool.getResource();   //缓存连接对象，相当于数据库连接对象connection
            try {
                String key = "Object:"+id;
                //实体对象并没有实现内部序列化操作
                //缓存逻辑：getByte[] --> 反序列化 --> Object
                byte[] bytes = jedis.get(key.getBytes()); //从jedis中获取目标对象的序列化对象数组
                if(bytes != null){
                    //反序列化逻辑
                    Object obj = schema.newMessage();  //通过schema生成一个新的空对象
                    ProtostuffIOUtil.mergeFrom(bytes, obj, schema);  //进行反序列化操作
                    return obj;
                }

            } finally {
                jedis.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
