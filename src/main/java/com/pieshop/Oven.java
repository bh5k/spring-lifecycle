package com.pieshop;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Oven {
    private final Baker baker;

    public Oven(@Lazy Baker baker) {
        this.baker = baker;
    }

    public void heatUp() {
        System.out.println("🔥 Oven heating up for " + baker.getName());
    }
}
