package com.example.inheritanceDemo2;

// multilevel inheritance

import com.example.inheritanceDemo1.Vehicle;

public class Bmw extends Car{
    int price=100000;
    public static void main(String[] args) {

        Vehicle v=new Vehicle();
        System.out.println(v.s);

        Car c1=new Car();
        System.out.println(c1.carTyres);
        System.out.println(c1.s);

        Bmw bmw=new Bmw();
        System.out.println(bmw.s);
        System.out.println(bmw.carTyres);
        System.out.println(bmw.price);


    }
}
