package com.pieshop;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
public class PieService {

    public PieService() {
        System.out.println("🍰 [Constructor] PieService bean instantiated");
    }

    
    public void postConstructInit() {
        System.out.println("🍰 [@PostConstruct] Initialization logic for PieService");
    }

    public void afterPropertiesSet() {
        System.out.println("🍰 [InitializingBean.afterPropertiesSet] Setup logic for PieService");
    }

    public void preDestroyCleanup() {
        System.out.println("🍰 [@PreDestroy] Cleanup logic for PieService");
    }

    public void destroy() {
        System.out.println("🍰 [DisposableBean.destroy] Final cleanup for PieService");
    }
}
