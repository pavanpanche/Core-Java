package com.example.methodExample;

public class SuperExampleImpl extends SuperExample {
    int a=9;
    void display()
    {
        System.out.println(a);
        System.out.println(super.a);
    }
    public static void main(String[] args)
    {
        SuperExampleImpl b1=new SuperExampleImpl();
        b1.display();
    }

}
//output 10
