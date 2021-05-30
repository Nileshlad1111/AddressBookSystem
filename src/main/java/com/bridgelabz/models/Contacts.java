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
        int i=0;
        String firstName = null;
        final String lastName, address, city, state, phone,zip;
        while(i==0) {
            System.out.print("Enter First Name : ");
            firstName = InputUtil.getStringValue();
            if (checkExists(firstName)) {
                System.out.println("Person Name Already Exists!!\nPlease enter different name...");
            }
            else {
                i=1;
            }
        }
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
        personList.add(new Person( firstName ,lastName , address , city , state , phone , zip ));
    }

    //Display method
    public void displayRecord() {
        if (personList.isEmpty()) {
            System.out.println("No recorders");
        } else {
            for (Person person : personList) {
                System.out.println(person);
            }

        }
    }
    // Edit method
    public void editRecord() {
        int id , choice = 0, i = 0;
        String firstName ,lastName , address , city , state ,zip , phone ;

        for(Person person: personList)
        {
            System.out.println("ID: #"+ personList.indexOf(person) + " : "+person);
        }

        System.out.print("\nEnter #ID to Edit Contact : ");
        id = InputUtil.getIntValue();
        System.out.println(personList.get(id));
        while(i == 0) {
            System.out.println("To edit contact details\n"
                    + "\t1: First name\n"
                    + "\t2: Last name\n"
                    + "\t3: Address\n"
                    + "\t4: city\n"
                    + "\t5: State\n"
                    + "\t6: Phone\n"
                    + "\t7: Zip Code\n"
                    + "\t8. Save And Exit\n");
            choice = InputUtil.getIntValue();
            switch (choice) {
                case 1:
                    System.out.print("Enter new Address : ");
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

    //Delete method
    public void deleteRecord()
    {
        int id;
        for(Person p : personList)
        {
            System.out.println("ID: #"+personList.indexOf(p) + " : " + p);
        }
        System.out.print("\nEnter #ID to delete Contact : ");
        id = InputUtil.getIntValue();
        personList.remove(id);
    }

    public boolean checkExists(String firstName)
    {
        int flag = 0;
        for (Person p: personList)
        {
            if (p.getFirstName().equals(firstName))
            {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
        {
            return true;
        }
        return false;
    }
 }



