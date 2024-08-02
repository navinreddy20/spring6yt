package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Dev obj = (Dev) context.getBean("dev");
//        obj.build();
    }
}
