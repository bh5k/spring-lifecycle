package com.pieshop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PieShopApplication {
    public static void main(String[] args) {
        SpringApplication.run(PieShopApplication.class, args);
    }

    @Bean
    CommandLineRunner demo(ApplicationContext ctx) {
        return args -> {
            Pie pie = ctx.getBean(Pie.class);
            pie.serve();
        };
    }

    @Bean
    CommandLineRunner demo2(ApplicationContext ctx) {
        return args -> {
            PieService service = ctx.getBean(PieService.class);
            System.out.println(service.bakePie());
        };
    }

}
