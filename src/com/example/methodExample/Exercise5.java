package com.example.methodExample;
// with formal parameter and with return statement

public class Exercise5 {
     String string(String a, String b){
         return (a+b);
     }

    public static void main(String[] args) {
        Exercise5 exercise5 = new Exercise5();
        String res = exercise5.string("Pavan ", "Panche");
        System.out.println(res);
    }
}
