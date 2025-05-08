package com.example.abstraction;

public class User {
    public static void main(String[] args)
    {
        RealMe pavan1=new AirtelImpl();
        pavan1.playYoutube();
        pavan1.sendSms();
        RealMe pavan2=new JioImpl();
        pavan2.playYoutube();
        pavan2.sendSms();

    }

}
