package com.example.methodExample;

import java.util.Arrays;

public class Exercise7 {
     void  b1(int[] a){
         System.out.println(Arrays.toString(a));

     }

    public static void main(String[] args) {
        Exercise7  exercise7 = new Exercise7();
        int [] res = {34,56,96,34,56};
        exercise7.b1(res);
    }
}
