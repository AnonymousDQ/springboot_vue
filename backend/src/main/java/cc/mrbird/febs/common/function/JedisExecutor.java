package cc.mrbird.febs.common.function;

import cc.mrbird.febs.common.exception.RedisConnectException;

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
