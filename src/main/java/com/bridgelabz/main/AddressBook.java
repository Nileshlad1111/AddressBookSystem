package com.bridgelabz.main;

import com.bridgelabz.models.Contacts;
import com.bridgelabz.utils.InputUtil;

public class AddressBook {
    public static void main(String[] args) {

        Contacts contacts = new Contacts();
        int choice , i = 0;
        while(i==0)
        {
            System.out.println("--- Address Book Management ---");
            System.out.println("1: Add New Person ");
            System.out.println("2: Display Records ");
            System.out.println("3: Edit Person Records ");
            System.out.println("4: Delete person");
            System.out.println("5: Sort");
            System.out.println("6: View Person By City and State");
            System.out.println("7: Exit	");
            System.out.println("--- Enter Your Choice ---");
            choice = InputUtil.getIntValue();
            switch(choice)
            {
                case 1 :
                    contacts.addRecord();
                    break;
                case 2 :
                    contacts.displayRecord();
                    break;
                case 3 :
                    contacts.editRecord();
                    break;
                case 4:
                    contacts.deleteRecord();
                    break;
                case 5 :
                    contacts.sortRecords();
                    break;
                case 6 :
                    contacts.viewByCityAndState();
                    break;
                case 7 :
                    i = -1;
                    break;
                default :
                    System.out.println("Please Enter Valid Option!!!");
            }
        }
    }
}
