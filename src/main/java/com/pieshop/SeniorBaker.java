package com.pieshop;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class SeniorBaker implements Baker {
    public SeniorBaker() {
        System.out.println("👨‍🍳 Senior Baker is ready");
    }

    @Override
    public void bake() {
        System.out.println("👨‍🍳 Senior Baker starts baking first");
    }
}
