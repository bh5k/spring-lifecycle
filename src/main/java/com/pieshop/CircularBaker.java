package com.pieshop;

import org.springframework.stereotype.Component;

@Component
public class CircularBaker implements Baker {

    private final Oven oven;

    public CircularBaker(Oven oven) {
        this.oven = oven;
    }

    @Override
    public void bake() {
        System.out.println("👨‍🍳 Baker is baking using oven...");
        oven.heatUp();
    }

    public String getName() {
        return "Circular Baker";
    }
    
}
