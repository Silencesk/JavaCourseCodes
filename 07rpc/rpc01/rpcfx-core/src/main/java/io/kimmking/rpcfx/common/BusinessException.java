package io.kimmking.rpcfx.common;

/**
 * 业务异常
 */
public class BusinessException extends RuntimeException {
    static final long serialVersionUID = 1352244900202885015L;

    public BusinessException(String msg) {
        super(msg);
    }

    public BusinessException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
