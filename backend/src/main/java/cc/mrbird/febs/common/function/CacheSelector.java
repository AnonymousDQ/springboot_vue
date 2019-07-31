package cc.mrbird.febs.common.function;

/**
 * @author victor
 * @decription：缓存选择器
 * @param <T>
 */
@FunctionalInterface
public interface CacheSelector<T> {
    T select() throws Exception;
}
