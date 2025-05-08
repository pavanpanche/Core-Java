package com.example.String;

public class FindLongString {
    public static void main(String[] args) {
        String[] s={"viratkohli","is", "a", "champ"};
        int max=s[0].length();
        int index=0;
        for(int i=1;i<s.length;i++)
        {
            if(s[i].length()>max)
            {
                max=s[i].length();
                index=i;
            }

        }
        System.out.println(s[index]);


    }
}
