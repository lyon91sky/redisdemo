//package com.lyon.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.stereotype.Service;
//
//@Service("redisService")
//public class RedisService {
//
//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;
//    @Autowired
//    private RedisTemplate<Object, Object> redisTemplate;
//
//    public void set(String key, String value) {
//        stringRedisTemplate.opsForValue().set(key, value);
//    }
//
//
//    public String get(String key) {
//        return stringRedisTemplate.opsForValue().get(key);
//    }
//
//}
