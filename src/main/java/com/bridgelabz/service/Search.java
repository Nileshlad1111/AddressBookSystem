package com.bridgelabz.service;

import com.bridgelabz.models.Person;
import com.bridgelabz.utils.InputUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Search {
    //search by city and state
    public static void searchByCityAndState(Map<String,String> cityDict, Map<String,String> stateDict, String city, String state)
    {
        System.out.println("In Progress...");
        System.out.println(cityDict);
        System.out.println(stateDict);
        List<String> cityMatch = cityDict.entrySet().stream()
                .filter(e -> city.equals(e.getValue())).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(cityMatch);
    }

   /* //search by person city List contact
    public static void searchByCity(List<Person> person)
    {
        String search = null;
        int flag = 0;
        List<Person> matches = new ArrayList<Person>();
        System.out.println("Enter First Name to search : ");
        search = InputUtil.getStringValue();
        for(Person p: person)
        {
            if(p.getCity().equalsIgnoreCase(search))
            {

                flag = 1;
                matches.add(p);
            }
        }
        if(flag == 1)
        {
            System.out.println("...Match Found...");
            for(Person p: matches)
            {
                System.out.println(p);
            }
        }
        else
        {
            System.out.println("Match Not Found!!!");
        }
    }
    //search by person state List contact
    public static void searchByState(List<Person> person)
    {
        String search = null;
        int flag = 0;
        List<Person> matches = new ArrayList<Person>();
        System.out.println("Enter First Name to search : ");
        search = InputUtil.getStringValue();
        for(Person p: person)
        {
            if(p.getState().equalsIgnoreCase(search))
            {

                flag = 1;
                matches.add(p);
            }
        }
        if(flag == 1)
        {
            System.out.println("...Match Found...");
            for(Person p: matches)
            {
                System.out.println(p);
            }
        }
        else
        {
            System.out.println("Match Not Found!!!");
        }
    }*/
}
