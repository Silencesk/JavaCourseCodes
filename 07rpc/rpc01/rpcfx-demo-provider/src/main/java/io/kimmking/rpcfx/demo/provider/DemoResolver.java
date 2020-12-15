package io.kimmking.rpcfx.demo.provider;

import io.kimmking.rpcfx.api.RpcfxResolver;
import io.kimmking.rpcfx.common.BusinessException;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class DemoResolver implements RpcfxResolver, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public <T> T resolve(String serviceClass) {
        Class<T> clazz;
        try {
            clazz = (Class<T>) Class.forName(serviceClass);
        } catch (ClassNotFoundException e) {
            throw new BusinessException("illegalArgument of  serviceClass: " + serviceClass);
        }

        return this.applicationContext.getBean(clazz);
    }
}
