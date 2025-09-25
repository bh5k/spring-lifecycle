package com.pieshop;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@DependsOn("oven")
public class Bakery {

    private final List<Baker> bakers;

    public Bakery(List<Baker> bakers) {
        this.bakers = bakers;
        System.out.println("🏪 Bakery is open!");
        startBaking();
    }

    private void startBaking() {
        System.out.println("🏪 Bakery is starting the baking process...");
        bakers.forEach(Baker::bake);
    }
}
