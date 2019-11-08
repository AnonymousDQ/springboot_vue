package com.victor.dan.function;

import com.victor.dan.exception.RedisConnectException;

/**
 * @author victor
 * @description:Jedis操作工具
 * @param <T>
 * @param <R>
 */
@FunctionalInterface
public interface JedisExecutor<T, R> {
    R excute(T t) throws RedisConnectException;
}
