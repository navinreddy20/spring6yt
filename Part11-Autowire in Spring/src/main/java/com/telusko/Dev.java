package com.telusko;

public class Dev {

    private Computer com;

    public Dev() {
        System.out.println("Dev constructor");
    }

    public Dev(Computer comp) {
        this.com = comp;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }


    public void build() {

        System.out.println("working on Awesome Project");
        com.compile();
    }
}
