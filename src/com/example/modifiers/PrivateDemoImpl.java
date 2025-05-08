package com.example.modifiers;

public class PrivateDemoImpl extends PrivateDemo {
    String s2 = "Student Of The Year";
    public static void main(String[] args) {
        PrivateDemo privateDemo = new PrivateDemo();    // we can't access directly to private property
        privateDemo.setS1("karan Johar");
        System.out.println(privateDemo.getS1());

        PrivateDemoImpl p = new PrivateDemoImpl();
        System.out.println(p.s2);
    }
}

