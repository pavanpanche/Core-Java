package com.example.methodExample;
//without formal parameters and with return statement.
public class Exercise6 {
    String pavaN(){
        return "Pavan is champ";
    }

    public static void main(String[] args) {
        Exercise6  exercise6 = new Exercise6();
        String s = exercise6.pavaN();
        System.out.println(s);

    }

}
