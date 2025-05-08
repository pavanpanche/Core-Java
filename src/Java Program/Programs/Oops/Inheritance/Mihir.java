package com.example.Oops.Inheritance;
//Single Inheritance

public class Mihir extends Pavan{
    int MihAmount=600;

    public static void main(String[] args) {

        Mihir m1=new Mihir();
        System.out.println(m1.MihAmount);  //===============>600
        System.out.println(m1.pavAmount);  //===============>500


        Pavan p1 = new Pavan();
        System.out.println(p1.pavAmount); // 600
//      System.out.println(p1.MihAmount);      parent can't access child property
    }

}
