package cn.tarsknock.helloboot.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.annotation.AccessType;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;


@Service
//@PropertySource(value = "classpath:/application.properties")
public class RedisService {

    @Autowired
    private JedisPool jedisPool;

    public void testRedis(){
       Jedis jedis = jedisPool.getResource();

        String setResult = jedis.set("test", "success");
        System.out.println(setResult);
        String value = jedis.get("test");
        System.out.println(value);
    }

}
