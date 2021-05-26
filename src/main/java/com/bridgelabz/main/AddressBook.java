package com.bridgelabz.main;

import com.bridgelabz.utils.InputUtil;

public class AddressBook {
    public static void main(String[] args) {
        //variable
        String firstName ,lastName , address , city , state ,zip , phone ;

        //person detailed and class method call
        System.out.println("Enter First Name");
        firstName = InputUtil.getStringValue();
        System.out.println("Enter Last Name");
        lastName = InputUtil.getStringValue();
        System.out.println("Enter Address");
        address = InputUtil.getStringValue();
        System.out.println("Enter City");
        city = InputUtil.getStringValue();
        System.out.println("Enter State");
        state = InputUtil.getStringValue();
        System.out.println("Enter Zip");
        zip = InputUtil.getStringValue();
        System.out.println("Enter phone number");
        phone = InputUtil.getStringValue();
    }
}
