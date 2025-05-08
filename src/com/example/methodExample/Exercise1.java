package com.example.methodExample;

public class Exercise1 {
    void show() {
        System.out.println("show method");
    }

    void display() {
        this.show();
        System.out.println("display method");

    }

    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        exercise1.show();

    }
}
