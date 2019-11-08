package com.victor.dan.function;

/**
 * @author victor
 * @decription：缓存选择器
 * @param <T>
 */
@FunctionalInterface
public interface CacheSelector<T> {
    T select() throws Exception;
}
