package com.example.abstraction;

public abstract class Demo {
    Demo()
    {
        System.out.println("constrcutors in abstract class");
    }
    void m1()
    {
        System.out.println("concrete without static in abstract class");
    }
    static  void m2()
    {
        System.out.println("concrete with static in abstract class");
    }
    abstract void m3();

}
