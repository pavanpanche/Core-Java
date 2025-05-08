package com.example.methodExample;

public class Exercise2 {
    void show()
    {
        System.out.println("show method");
        this.display();
    }
    void display()
    {

        System.out.println("display method");
    }

    public static void main(String[] args) {
        Exercise2 exercise2 = new Exercise2();
        exercise2.show();
    }

}
