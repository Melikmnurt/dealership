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
        return null;
    }
    // returns vehicles by make and model
    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return null;
    }

    // returns vehicles within a year range
    public ArrayList<Vehicle> getVehiclesByYear(int min, int max) {
        return null;
    }

    // returns vehicles by color
    public ArrayList<Vehicle> getVehiclesByColor(String color) {
        return null;
    }

    // returns vehicles within a mileage range
    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {
        return null;
    }

    // returns vehicles by type
    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {
        return null;
    }
    // removes a vehicle from inventory
    public void removeVehicle(Vehicle vehicle) {

    }
}

