package com.telusko;

public class Dev {

    private Laptop laptop;
    private int age;

    public Dev() {
        System.out.println("Dev constructor");
    }


//    public Dev(int age) {
//        this.age = age;
//        System.out.println("Dev 1 constructor");
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Dev(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("Dev 1 constructor");
    }

    public void build() {

        System.out.println("working on Awesome Project");
         laptop.compile();
    }
}
