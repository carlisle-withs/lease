package com.atguigu.lease.common.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

/**
 * Author: Carlisle Cullen
 * Date: 2025/3/1 上午10:34
 * projectName: com.atguigu.lease.common.redis
 * description:
 */
@Configuration
public class RedisConfiguration {

    @Bean
    public RedisTemplate<String, Object> stringObjectRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Object> res = new RedisTemplate<>();
        res.setConnectionFactory(redisConnectionFactory);
        res.setKeySerializer(RedisSerializer.string());
        res.setValueSerializer(RedisSerializer.java());
        return res;
    }

}
