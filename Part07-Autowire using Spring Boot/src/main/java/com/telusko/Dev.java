package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    //field injection
    @Autowired
    @Qualifier("laptop")
    private Computer comp;


    //constructor injection
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }


    //setter injection
//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build() {
        comp.compile();
        System.out.println("working on Awesome Project");
    }
}
