package com.example.methodExample;
//with formal parameter without return
public class Exercise3 {
    void m1(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Exercise3 exercise3 = new Exercise3();
        exercise3.m1(5, 6);

    }
}
