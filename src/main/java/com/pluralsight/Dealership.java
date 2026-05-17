package com.pluralsight;
import java.util.ArrayList;
public class Dealership {// dealership name
    private String name;

    // dealership address
    private String address;

    // dealership phone number
    private String phone;

    // list of vehicles in inventory
    private ArrayList<Vehicle> inventory;

    // constructor used to create a dealership object
    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;

// create the inventory list
        inventory = new ArrayList<>();

    }
}

