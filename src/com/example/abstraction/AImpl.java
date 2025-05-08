package com.example.abstraction;

public class AImpl extends A {
    @Override
    void m2() {
        System.out.println("m2 is ovverriden in implemetation AImpl class");
    }

    public static void main(String[] args) {
        AImpl p = new AImpl();
        p.m1();
        p.m2();
    }
}
