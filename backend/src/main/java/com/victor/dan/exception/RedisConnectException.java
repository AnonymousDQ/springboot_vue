package com.victor.dan.exception;

/**
 * @author victor
 * @description:Redis 连接异常
 */
public class RedisConnectException extends Exception {

    private static final long serialVersionUID = 1639374111871115063L;

    public RedisConnectException(String message) {
        super(message);
    }
}
