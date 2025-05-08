package com.example.inheritanceDemo1;
//Single Inheritance
public class Car extends Vehicle{
    int price=2000;

    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        System.out.println(v.s);      // ===============>engine
        Car c=new Car();
        System.out.println(c.price);  // ================>2000
        System.out.println(c.s);      // ===============>engine


    }
}
