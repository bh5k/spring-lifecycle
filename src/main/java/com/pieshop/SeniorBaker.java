package com.pieshop;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class SeniorBaker implements Baker {
    public SeniorBaker() {
        System.out.println("👨‍🍳 Senior Baker is ready");
    }

    @Override
    public void bake() {
        System.out.println("👨‍🍳 Senior Baker starts baking first");
    }

    @Override
    public String getName() {
        return "Senior Baker!";
    }
}
