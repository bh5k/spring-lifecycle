package com.pieshop;

import org.springframework.stereotype.Component;

//@Component
public class JuniorBaker implements Baker {
    public JuniorBaker() {
        System.out.println("🧑‍🍳 Junior Baker is ready");
    }

    @Override
    public void bake() {
        System.out.println("🧑‍🍳 Junior Baker follows the Senior Baker");
    }

    @Override
    public String getName() {
        return "Junior Baker!";
    }
}
