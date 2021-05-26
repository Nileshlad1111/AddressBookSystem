package com.bridgelabz.models;

import com.bridgelabz.utils.InputUtil;

import java.util.ArrayList;
import java.util.List;

public class Contacts {
    //Goble store contact details
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

        //person list add method
        personList.add(new Person(firstName,lastName,address,city,state,phone,zip));
    }

    //Display method
    public void displayRecord()
    {
        for(Person p1: personList)
        {
            System.out.println(p1);
        }

    }

    // Edit method
    public void editeRecord() {
        int id,choice = 0, i=0;
        String firstName ,lastName , address , city , state ,zip , phone ;

        for(Person person: personList)
        {
            System.out.println("ID: #"+personList.indexOf(person)+" : "+person);
        }

        System.out.print("\nEnter #ID to Edit Contact : ");
        id = InputUtil.getIntValue();
        System.out.println(personList.get(id));
        while(i==0) {
            System.out.println("To edit contact details\n"
                    + "\t1: First name"
                    + "\t2:  Last name"
                    + "\t1: Address\n"
                    + "\t2: city\n"
                    + "\t3: State\n"
                    + "\t4: Phone\n"
                    + "\t5: Zip Code\n"
                    + "\t6. Save And Exit\n");
            choice = InputUtil.getIntValue();
            switch (choice) {
                case 1:
                    System.out.print("Enter new Street : ");
                    address = InputUtil.getStringValue();
                    personList.get(id).setAddress(address);
                    break;
                case 2:
                    System.out.print("Enter new firstName : ");
                    firstName = InputUtil.getStringValue();
                    personList.get(id).setCity(firstName);
                    break;
                case 3:
                    System.out.print("Enter new lastName : ");
                    lastName = InputUtil.getStringValue();
                    personList.get(id).setCity(lastName);
                    break;
                case 4:
                    System.out.print("Enter new City : ");
                    city = InputUtil.getStringValue();
                    personList.get(id).setCity(city);
                    break;
                case 5:
                    System.out.print("Enter new State : ");
                    state = InputUtil.getStringValue();
                    personList.get(id).setState(state);
                    break;
                case 6:
                    System.out.print("Enter new Phone : ");
                    phone = InputUtil.getStringValue();
                    personList.get(id).setPhone(phone);
                    break;
                case 7:
                    System.out.print("Enter new Zip Code : ");
                    zip = InputUtil.getStringValue();
                    personList.get(id).setZip(zip);
                    break;
                case 8:
                    i=1;
                    break;
                default:
                    System.out.println("Please Enter Valid Option");
            }
            System.out.println(personList.get(id));
        }
    } //end of edit() method }
 }



