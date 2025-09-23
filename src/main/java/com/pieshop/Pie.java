package com.pieshop;

import org.springframework.stereotype.Component;

@Component("myPie")
public class Pie {
    private String name = "Default Pie";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void serve() {
        System.out.println("Serving: " + name);
    }
}
