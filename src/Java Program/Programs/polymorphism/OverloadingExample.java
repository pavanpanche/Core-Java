package com.example.polymorphism;

public class OverloadingExample {
    void add(int a)
    {
        System.out.println("welcome to java");
    }
    void add(float b)
    {
        System.out.println("welcome to python");
    }
    public static void main(String[] args)
    {
        OverloadingExample a1=new OverloadingExample();
        a1.add(12); //===================>welcome to java

    }

}
