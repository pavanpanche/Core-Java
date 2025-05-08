package com.example.String;

public class VowelStringDemo {
    public static void main(String[] args) {
        String s="virat";
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||
                    (s.charAt(i)=='o')||(s.charAt(i)=='u')||(s.charAt(i)=='A')||
                    (s.charAt(i)=='E')||(s.charAt(i)=='I')||(s.charAt(i)=='O')||
                    (s.charAt(i)=='U'))
            {
                System.out.println("vowel");
            }
            else
            {
                System.out.println("consonant");
            }
        }


    }
}
