package io.kimmking.rpcfx.common;

/**
 * 远程调用异常
 */
public class RpcfxException extends RuntimeException {

    static final long serialVersionUID = -472231417416444970L;

    /**
     * This field holds the target if the
     * InvocationTargetException(Throwable target) constructor was
     * used to instantiate the object
     *
     * @serial
     *
     */
    private Throwable target;

    public RpcfxException(String msg) {
        super(msg);
    }

    public RpcfxException(Throwable target, String msg) {
        super(msg);
        this.target = target;
    }
}
