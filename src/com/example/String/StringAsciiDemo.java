package com.example.String;

public class StringAsciiDemo {
    public static void main(String[] args) {
        String s="Pavan";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            System.out.println(ch+":"+(int)(ch));
        }

    }
}


//output :  P:80, a:97, v:118, a:97, n:110

