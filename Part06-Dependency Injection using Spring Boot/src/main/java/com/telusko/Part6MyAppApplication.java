package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Part6MyAppApplication {

    public static void main(String[] args) {


        ApplicationContext context = SpringApplication.run(Part6MyAppApplication.class, args);
        Dev dev = context.getBean(Dev.class);
        dev.build();
    }

}
