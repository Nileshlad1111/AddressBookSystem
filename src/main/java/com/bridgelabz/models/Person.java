package com.bridgelabz.models;

import java.util.Comparator;

public class Person {
    private String firstName, lastName, address, city, state, phone,zip;

    public Person(String firstName, String lastName, String address, String city, String state, String phone, String zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phone = phone;
        this.zip = zip;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    // Sort By First Name
    public static Comparator<Person> firstNameSorting = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2)
        {
            String firstName1 = p1.getFirstName();
            String firstName2 = p2.getFirstName();
            // ascending order
            return firstName1.compareToIgnoreCase(firstName2);
        }
    };

    // Sort By City
    public static Comparator<Person> citySorting = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2)
        {
            String city1 = p1.getCity();
            String city2 = p2.getCity();
            // ascending order
            return city1.compareToIgnoreCase(city2);
        }
    };
    // Sort By State
    public static Comparator<Person> stateSorting = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2)
        {
            String state1 = p1.getState();
            String state2 = p2.getState();
            // ascending order
            return state1.compareToIgnoreCase(state2);
        }
    };
    // Sort By Zip
    public static Comparator<Person> zipSorting = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2)
        {
            String zip1 = p1.getZip();
            String zip2 = p2.getZip();
            // ascending order
            return zip1.compareToIgnoreCase(zip2);
        }
    };

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", phone='" + phone + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
