package com.example.String;

public class RemoveSpaceString {
    public static void main(String[] args) {
        // with predefine methods

//        String s="virat is a king";
//        String res=s.replaceAll(" ","");
//        System.out.println(res);
//        String res1=s.replaceAll("\\s","");
//        System.out.println(res1);

    //Remove Space in String without predefine methods
        String s="virat is a king";
        String res="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                res=res+ch;
            }
            else
            {
                res=res + s.charAt(i+1);
            }
        }
        System.out.println(res);


    }
}
