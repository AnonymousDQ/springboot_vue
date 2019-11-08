package com.victor.dan.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

import java.io.IOException;

/**
 * @Description:Redis的序列化器
 * @Author: VictorDan
 * @Date: 19-7-31 下午3:41
 * @Version: 1.0
 */
public class JacksonRedisSerializer<T> implements RedisSerializer<T>{
        private Class<T> clazz;
        private ObjectMapper mapper;

        JacksonRedisSerializer(Class<T> clazz) {
            super();
            this.clazz = clazz;
            this.mapper = new ObjectMapper();
            mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        }

        @Override
        public byte[] serialize(T t) throws SerializationException {
            try {
                return mapper.writeValueAsBytes(t);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override
        public T deserialize(byte[] bytes) throws SerializationException {
            if (bytes.length <= 0) {
                return null;
            }
            try {
                return mapper.readValue(bytes, clazz);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
}
