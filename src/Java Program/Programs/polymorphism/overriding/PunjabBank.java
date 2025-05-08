package com.example.polymorphism.overriding;

public class PunjabBank extends Sbi {

    void phonePay(int am)
    {
        System.out.println(am);
    }
    public static void main(String[] args)
    {
        Sbi ajay=new Sbi();
        ajay.phonePay(500);
        PunjabBank pari=new PunjabBank();
        pari.phonePay(700);
    }

}
