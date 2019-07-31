package cc.mrbird.febs.common.exception;

import org.apache.shiro.authc.AuthenticationException;

/**
 * @author victor
 * @description:token过期异常抛出
 */
public class TokenTimeoutException extends AuthenticationException {

    private static final long serialVersionUID = -8313101744886192005L;

    public TokenTimeoutException(String message) {
        super(message);
    }
}
