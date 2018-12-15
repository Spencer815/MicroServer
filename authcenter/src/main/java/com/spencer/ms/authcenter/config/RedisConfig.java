package com.spencer.ms.authcenter.config;

import com.spencer.ms.authcenter.util.RedisCache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lichao
 * @date 2018/12/15
 **/

@Configuration
public class RedisConfig {

    @Bean
    public RedisCache redisCache() {
        return new RedisCache();
    }
}
