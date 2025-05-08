package com.example.abstraction;

public class JioImpl extends AirtelImpl {
    @Override
    void sendSms()
    {
        System.out.println("sending sms from jio");
    }

}
