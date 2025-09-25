package com.pieshop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class TimingBeanPostProcessor implements BeanPostProcessor {

    @Override
    @Nullable
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof PieService) {
            System.out.println("Wrapping " + beanName + " with timing proxy");

            return Proxy.newProxyInstance(
                    bean.getClass().getClassLoader(),
                    bean.getClass().getInterfaces().length > 0
                            ? bean.getClass().getInterfaces()
                            : new Class[]{PieService.class}, // fallback if no interfaces
                    new TimingInvocationHandler(bean)
            );
        }
        return bean;
    }
    
    private static class TimingInvocationHandler implements InvocationHandler {
        private final Object target;

        TimingInvocationHandler(Object target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            long start = System.nanoTime();
            Object result = method.invoke(target, args);
            long end = System.nanoTime();
            System.out.println("Method " + method.getName() + " took " + (end - start) / 1_000_000 + " ms");
            return result;
        }
    }

}
