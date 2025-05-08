package com.example.polymorphism;

public class Example3 {
    void add(int a,float b)
    {
        System.out.println("welcome to java");
    }
    void add(float a,int b)
    {
        System.out.println("welcome to python");
    }
    void add(int a)
    {
        System.out.println("welcome to c");
    }

    public static void main(String[] args) {
        Example3 e = new Example3();
        e.add(34.52f,5);

    }
}
