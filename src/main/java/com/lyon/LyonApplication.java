package com.lyon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class LyonApplication {
//    @Autowired
//    private static RedisTemplate redisTemplate;
    public static void main(String[] args) {
        SpringApplication.run(LyonApplication.class, args);
//        redisTemplate.opsForValue().set("li","ouba");
    }
}