package com.bridgelabz.service;

import com.bridgelabz.models.Person;

import java.util.Collections;
import java.util.List;

public class Sort {
    public static void sortByName(List<Person> person)
    {
        Collections.sort(person, Person.firstNameSorting);
        for(Person p: person)
        {
            System.out.println(p);
        }
    }
}
