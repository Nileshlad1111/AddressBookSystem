package com.bridgelabz.models;

import com.bridgelabz.utils.InputUtil;

import java.util.ArrayList;
import java.util.List;

public class Contacts {
    List<Person> personList = new ArrayList<Person>();
    //	ADD METHOD
    public void addRecord()
    {
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

        //calling add method
        personList.add(new Person(firstName,lastName,address,city,state,phone,zip));
    }

    //	DISPLAY METHOD
    public void displayRecord()
    {
        for(Person p1: personList)
        {
            System.out.println(p1);
        }

    }
}

