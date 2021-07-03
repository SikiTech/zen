/**
 * projectName: redis
 * fileName: RedisConfig.java
 * packageName: com.sikiapp.redis.config
 * date: 2019-05-28 下午3:24
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.tsaidog.zen.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

import java.io.Serializable;

/**
 * 创建RedisConnectionFactory 对象
 * @author: Robert

 **/
@Slf4j
@Configuration
public class RedisConfig {

    @Bean(name = "redisConnectionFactory")
    public RedisConnectionFactory initRedisConnectionFactory() {
        // 连接池配置
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxTotal(50);
        poolConfig.setMaxIdle(30);
        poolConfig.setMaxWaitMillis(2000);

        // 创建Jedis连接工厂
        JedisConnectionFactory connectionFactory = new JedisConnectionFactory(poolConfig);
        RedisStandaloneConfiguration rsCfg = connectionFactory.getStandaloneConfiguration();
        rsCfg.setHostName("localhost");
        rsCfg.setPort(6379);
        return connectionFactory;
    }

    @Bean(name = "redisTemplate")
    public RedisTemplate<Object, Object> initRedisTemplate() {
        RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<>();
        // Redistemplate 中默认会定义一个stringSerializer 对象
        RedisSerializer<String> stringSerializer = redisTemplate.getStringSerializer();
        // 设置序列化器
        redisTemplate.setKeySerializer(stringSerializer);
        redisTemplate.setHashKeySerializer(stringSerializer);
        redisTemplate.setHashValueSerializer(stringSerializer);
        redisTemplate.setConnectionFactory(initRedisConnectionFactory());
        log.debug("序列化器....");
        return redisTemplate;
    }

    @Bean
    public RedisTemplate<String, Serializable> redisCacheTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Serializable> template = new RedisTemplate<>();
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        template.setConnectionFactory(redisConnectionFactory);
        return template;
    }

}