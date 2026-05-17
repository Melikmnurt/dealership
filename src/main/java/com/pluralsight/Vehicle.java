package com.pluralsight;

public class Vehicle {
    private int vin;
    private int year;
    private String make;
    private String model;
    private String vehicleType;
    private String color;
    private int odometer;
    private double price;

    // constructor used to create a Vehicle object
    public Vehicle(int vin, int year, String make, String model,
                   String vehicleType, String color,
                   int odometer, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }
    // returns the vehicle VIN
    public int getVin() {
        return vin;
    }
    // returns the vehicle year
    public int getYear() {
        return year;
    }

    // returns the vehicle make
    public String getMake() {
        return make;
    }

    // returns the vehicle model
    public String getModel() {
        return model;
    }

    // returns the vehicle type
    public String getVehicleType() {
        return vehicleType;
    }

    // returns the vehicle color
    public String getColor() {
        return color;
    }

    // returns the vehicle mileage
    public int getOdometer() {
        return odometer;
    }

    // returns the vehicle price
    public double getPrice() {
        return price;
    }
    // updates the vehicle VIN
    public void setVin(int vin) {
        this.vin = vin;
    }
    // updates the vehicle year
    public void setYear(int year) {
        this.year = year;
    }

    // updates the vehicle make
    public void setMake(String make) {
        this.make = make;
    }

    // updates the vehicle model
    public void setModel(String model) {
        this.model = model;
    }

    // updates the vehicle type
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    // updates the vehicle color
    public void setColor(String color) {
        this.color = color;
    }

    // updates the vehicle mileage
    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    // updates the vehicle price
    public void setPrice(double price) {
        this.price = price;
    }
    // returns a formatted string describing the vehicle
    @Override
    public String toString() {
        return vin + " | " +
                year + " | " +
                make + " | " +
                model + " | " +
                vehicleType + " | " +
                color + " | " +
                odometer + " miles | $" +
                price;
    }
}
