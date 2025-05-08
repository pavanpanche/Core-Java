package com.example.modifiers.mypackage;

public class Student extends Person {
    public void display() {
        System.out.println(name);  // ✅ Allowed: subclass
    }
}
