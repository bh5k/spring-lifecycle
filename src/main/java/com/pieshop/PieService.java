package com.pieshop;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
public class PieService implements InitializingBean, DisposableBean {

    public PieService() {
        System.out.println("🍰 [Constructor] PieService bean instantiated");
    }

    @PostConstruct
    public void postConstructInit() {
        System.out.println("🍰 [@PostConstruct] Initialization logic for PieService");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("🍰 [InitializingBean.afterPropertiesSet] Setup logic for PieService");
    }

    @PreDestroy
    public void preDestroyCleanup() {
        System.out.println("🍰 [@PreDestroy] Cleanup logic for PieService");
    }

    @Override
    public void destroy() {
        System.out.println("🍰 [DisposableBean.destroy] Final cleanup for PieService");
    }
}
