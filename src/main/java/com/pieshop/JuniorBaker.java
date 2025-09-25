package com.pieshop;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class JuniorBaker implements Baker {
    public JuniorBaker() {
        System.out.println("🧑‍🍳 Junior Baker is ready");
    }

    @Override
    public void bake() {
        System.out.println("🧑‍🍳 Junior Baker follows the Senior Baker");
    }
}
