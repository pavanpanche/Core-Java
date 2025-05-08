package com.example.methodExample;


public class ThisExample {
    static int a = 9;

    void show() {
        int a = 6;
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        ThisExample thisExample = new ThisExample();
        thisExample.show();

    }
}