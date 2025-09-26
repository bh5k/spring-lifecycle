package com.pieshop;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;


@Component
@DependsOn("oven")
public class Bakery {

    private final Baker baker;

    public Bakery(Baker baker) {
        this.baker = baker;
        System.out.println("🏪 Bakery is open!");
        startBaking();
    }

    public void openShop() {
        System.out.println("🏪 Bakery is open!");
        baker.bake();
    }

    private void startBaking() {
        System.out.println("🏪 Bakery is starting the baking process...");
        baker.bake();
    }
}
