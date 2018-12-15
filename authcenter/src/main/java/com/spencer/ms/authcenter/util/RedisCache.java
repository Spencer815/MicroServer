package com.spencer.ms.authcenter.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * redis操作工具类
 *
 * @author lichao
 * @date 2018/12/3
 **/
public class RedisCache {
    @Autowired
    private RedisTemplate<String, ?> redisTemplate;

    public boolean setString(String key, String value) {
        boolean result = redisTemplate.execute((RedisCallback<Boolean>) connection -> {
            RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
            connection.set(serializer.serialize(key), serializer.serialize(value));
            return true;
        });
        return result;
    }

    public String getString(String key) {
        String result = redisTemplate.execute((RedisCallback<String>) connection -> {
            RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
            byte[] value = connection.get(serializer.serialize(key));
            return serializer.deserialize(value);
        });
        return result;
    }


    public boolean expire(String key, long expire) {
        return redisTemplate.expire(key, expire, TimeUnit.SECONDS);
    }


    public <T> boolean setList(String key, List<T> list) {
        String value = JsonHelper.toJson(list);
        return setString(key, value);
    }


    public <T> List<T> getList(final String key, Class<T> clz) {
        String json = getString(key);
        if (json != null) {
            List<T> list = JsonHelper.toList(json, clz);
            return list;
        }
        return null;
    }

    /**
     * 功能描述：从redis中获取数据
     *
     * @param key
     * @param elementType
     * @param <T>
     * @return
     */
    public <T> T getObject(final String key, Class<T> elementType) {
        return redisTemplate.execute((RedisCallback<T>) connection -> {
            byte[] keybytes = redisTemplate.getStringSerializer().serialize(key);
            if (connection.exists(keybytes)) {
                byte[] valuebytes = connection.get(keybytes);
                @SuppressWarnings("unchecked")
                T value = (T) SerializeUtil.unserialize(valuebytes);
                return value;
            }
            return null;
        });
    }

    /**
     * 功能描述：设值到redis中
     *
     * @param key
     * @param obj
     */
    public void setObject(String key, Object obj) {
        final byte[] bytes = SerializeUtil.serialize(obj);
        redisTemplate.execute((RedisCallback<Object>) connection -> {
            connection.set(redisTemplate.getStringSerializer().serialize(key), bytes);
            return null;
        });
    }


    public long rPush(String key, Object obj) {
        String value = JsonHelper.toJson(obj);
        long result = redisTemplate.execute((RedisCallback<Long>) connection -> {
            RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
            long count = connection.rPush(serializer.serialize(key), serializer.serialize(value));
            return count;
        });
        return result;
    }


    public String lPop(String key) {
        String result = redisTemplate.execute((RedisCallback<String>) connection -> {
            RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
            byte[] res = connection.lPop(serializer.serialize(key));
            return serializer.deserialize(res);
        });
        return result;
    }

}
