package com.pluralsight;

import java.util.ArrayList;

public class Dealership {

    // dealership name
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

    // returns the dealership name
    public String getName() {
        return name;
    }

    // returns the dealership address
    public String getAddress() {
        return address;
    }

    // returns the dealership phone number
    public String getPhone() {
        return phone;
    }

    // returns the dealership inventory
    public ArrayList<Vehicle> getAllVehicles() {
        return inventory;
    }

    // updates the dealership name
    public void setName(String name) {
        this.name = name;
    }

    // updates the dealership address
    public void setAddress(String address) {
        this.address = address;
    }

    // updates the dealership phone number
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // adds a vehicle to the dealership inventory
    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    // returns vehicles within a price range
    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {

        // list used to store matching vehicles
        ArrayList<Vehicle> matchingVehicles =
                new ArrayList<>();

        // loop through all vehicles in inventory
        for (Vehicle vehicle : inventory) {

            // check if the vehicle price is within range
            if (vehicle.getPrice() >= min &&
                    vehicle.getPrice() <= max) {

                // add matching vehicle to results list
                matchingVehicles.add(vehicle);
            }
        }

        // return the matching vehicles
        return matchingVehicles;
    }

    // returns vehicles by make and model
    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {

        // list used to store matching vehicles
        ArrayList<Vehicle> matchingVehicles =
                new ArrayList<>();

        // loop through all vehicles in inventory
        for (Vehicle vehicle : inventory) {
            // check if make and model both match
            if (vehicle.getMake().equalsIgnoreCase(make) &&
                    vehicle.getModel().equalsIgnoreCase(model)) {

                // add matching vehicle to results
                matchingVehicles.add(vehicle);
            }

        }
        return matchingVehicles;
    }
    // returns vehicles within a year range
    public ArrayList<Vehicle> getVehiclesByYear(int min, int max) {
        return null;
    }

    // returns vehicles by color
    public ArrayList<Vehicle> getVehiclesByColor(String color) {

        // list used to store matching vehicles
        ArrayList<Vehicle> matchingVehicles =
                new ArrayList<>();

        // loop through all vehicles in inventory
        for (Vehicle vehicle : inventory) {

            // check if vehicle color matches the user's request
            if (vehicle.getColor().equalsIgnoreCase(color)) {

                // add matching vehicle to results
                matchingVehicles.add(vehicle);
            }
        }

        // return matching vehicles
        return matchingVehicles;
    }

    // returns vehicles by type
    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {

        // list used to store matching vehicles
        ArrayList<Vehicle> matchingVehicles =
                new ArrayList<>();

        // loop through all vehicles in inventory
        for (Vehicle vehicle : inventory) {

            // check if vehicle type matches the user's request
            if (vehicle.getVehicleType().equalsIgnoreCase(vehicleType)) {

                // add matching vehicle to results
                matchingVehicles.add(vehicle);
            }
        }

        // return matching vehicles
        return matchingVehicles;
    }

    // returns vehicles within a mileage range
    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {
        return null;
    }

    // removes a vehicle from inventory
    public void removeVehicle(Vehicle vehicle) {

    }
}