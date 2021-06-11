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
}
