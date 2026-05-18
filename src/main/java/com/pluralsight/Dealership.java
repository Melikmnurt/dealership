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

    // returns all vehicles in inventory
    public ArrayList<Vehicle> getAllVehicles() {
        return inventory;
    }

    // updates dealership name
    public void setName(String name) {
        this.name = name;
    }

    // updates dealership address
    public void setAddress(String address) {
        this.address = address;
    }

    // updates dealership phone number
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // adds a vehicle to inventory
    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    // removes a vehicle from inventory
    public void removeVehicle(Vehicle vehicle) {
        inventory.remove(vehicle);
    }

    // returns vehicles within a price range
    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {

        // list used to store matching vehicles
        ArrayList<Vehicle> matchingVehicles =
                new ArrayList<>();

        // loop through inventory
        for (Vehicle vehicle : inventory) {

            // check if price is within range
            if (vehicle.getPrice() >= min &&
                    vehicle.getPrice() <= max) {

                matchingVehicles.add(vehicle);
            }
        }

        return matchingVehicles;
    }

    // returns vehicles by make and model
    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {

        // list used to store matching vehicles
        ArrayList<Vehicle> matchingVehicles =
                new ArrayList<>();

        // loop through inventory
        for (Vehicle vehicle : inventory) {

            // check if make and model match
            if (vehicle.getMake().equalsIgnoreCase(make) &&
                    vehicle.getModel().equalsIgnoreCase(model)) {

                matchingVehicles.add(vehicle);
            }
        }

        return matchingVehicles;
    }

    // returns vehicles within a year range
    public ArrayList<Vehicle> getVehiclesByYear(int min, int max) {

        // list used to store matching vehicles
        ArrayList<Vehicle> matchingVehicles =
                new ArrayList<>();

        // loop through inventory
        for (Vehicle vehicle : inventory) {

            // check if year is within range
            if (vehicle.getYear() >= min &&
                    vehicle.getYear() <= max) {

                matchingVehicles.add(vehicle);
            }
        }

        return matchingVehicles;
    }

    // returns vehicles by color
    public ArrayList<Vehicle> getVehiclesByColor(String color) {

        // list used to store matching vehicles
        ArrayList<Vehicle> matchingVehicles =
                new ArrayList<>();

        // loop through inventory
        for (Vehicle vehicle : inventory) {

            // check if color matches
            if (vehicle.getColor().equalsIgnoreCase(color)) {

                matchingVehicles.add(vehicle);
            }
        }

        return matchingVehicles;
    }

    // returns vehicles within a mileage range
    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {

        // list used to store matching vehicles
        ArrayList<Vehicle> matchingVehicles =
                new ArrayList<>();

        // loop through inventory
        for (Vehicle vehicle : inventory) {

            // check if mileage is within range
            if (vehicle.getOdometer() >= min &&
                    vehicle.getOdometer() <= max) {

                matchingVehicles.add(vehicle);
            }
        }

        return matchingVehicles;
    }

    // returns vehicles by type
    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {

        // list used to store matching vehicles
        ArrayList<Vehicle> matchingVehicles =
                new ArrayList<>();

        // loop through inventory
        for (Vehicle vehicle : inventory) {

            // check if type matches
            if (vehicle.getVehicleType()
                    .equalsIgnoreCase(vehicleType)) {

                matchingVehicles.add(vehicle);
            }
        }

        return matchingVehicles;
    }
}