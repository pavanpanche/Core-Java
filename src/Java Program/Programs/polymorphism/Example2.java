package com.example.polymorphism;

public class Example2 {
    void add(int a,int b)
    {
        System.out.println("welcome to java");
    }
    void add(int c)
    {
        System.out.println("welcome to python");
    }
    public static void main(String[] args)
    {
        Example2 a1=new Example2();
        a1.add(1,7);      // =================>welcome to java

    }

}
