package com.example.methodExample;

public class SuperExample1Impl extends SuperExample1 {
    void mahesh(){
        System.out.println("mahesh present in sub Class");
        super.mahesh();
    }

    public static void main(String[] args) {
        SuperExample1Impl s1= new SuperExample1Impl();
        s1.mahesh();
    }
}
