package com.example.modifiers;

public class PublicExampleImpl extends PublicExample {
    String string = "Manirathan";
    public static void main(String[] args)
    {
        PublicExampleImpl publicExample =new PublicExampleImpl();
        System.out.println(publicExample.string);
        System.out.println(publicExample.s);
    }


}
