package com.example.polymorphism.overriding;

public class OverridingDemoImpl extends OverridingDemo {
    void add()
    {
        System.out.println("Sachin Tendulkar");
    }
    public static void main(String[] args)
    {
        OverridingDemoImpl b1=new OverridingDemoImpl();
        b1.add();   // ==================>scahin Tendulakar
    }


}
