package com.pluralsight;

import java.io.*;
import java.util.ArrayList;

public class DealershipFileManager {

    // reads the inventory file and creates a dealership object
    public Dealership getDealership() {

        // dealership object loaded from the file
        Dealership dealership = null;

        try {

            // open inventory file for reading
            BufferedReader bufReader =
                    new BufferedReader(new FileReader("inventory.csv"));

            // read dealership information
            String dealershipLine = bufReader.readLine();

            // split dealership data using pipe delimiter
            String[] dealershipParts =
                    dealershipLine.split("\\|");

            // create dealership object
            dealership = new Dealership(
                    dealershipParts[0],
                    dealershipParts[1],
                    dealershipParts[2]
            );

            // variable used to store each vehicle line
            String input;

            // loop through all remaining lines
            while ((input = bufReader.readLine()) != null) {

                // split vehicle data
                String[] vehicleParts =
                        input.split("\\|");

                // parse vehicle data
                int vin =
                        Integer.parseInt(vehicleParts[0]);

                int year =
                        Integer.parseInt(vehicleParts[1]);

                String make = vehicleParts[2];
                String model = vehicleParts[3];
                String vehicleType = vehicleParts[4];
                String color = vehicleParts[5];

                int odometer =
                        Integer.parseInt(vehicleParts[6]);

                double price =
                        Double.parseDouble(vehicleParts[7]);

                // create vehicle object
                Vehicle vehicle = new Vehicle(
                        vin,
                        year,
                        make,
                        model,
                        vehicleType,
                        color,
                        odometer,
                        price
                );

                // add vehicle to dealership inventory
                dealership.addVehicle(vehicle);
            }

            // close the file
            bufReader.close();

        } catch (IOException e) {

            // display error message
            System.out.println("Error reading inventory file.");
        }

        return dealership;
    }

    // saves dealership inventory back to the file
    public void saveDealership(Dealership dealership) {

        try {

            // open inventory file for writing
            BufferedWriter bufWriter =
                    new BufferedWriter(new FileWriter("inventory.csv"));

            // write dealership information
            bufWriter.write(
                    dealership.getName() + "|" +
                            dealership.getAddress() + "|" +
                            dealership.getPhone()
            );

            // move to next line
            bufWriter.newLine();

            // get all vehicles from inventory
            ArrayList<Vehicle> vehicles =
                    dealership.getAllVehicles();

            // loop through all vehicles
            for (Vehicle vehicle : vehicles) {

                // write vehicle data to file
                bufWriter.write(
                        vehicle.getVin() + "|" +
                                vehicle.getYear() + "|" +
                                vehicle.getMake() + "|" +
                                vehicle.getModel() + "|" +
                                vehicle.getVehicleType() + "|" +
                                vehicle.getColor() + "|" +
                                vehicle.getOdometer() + "|" +
                                vehicle.getPrice()
                );

                // move to next line
                bufWriter.newLine();
            }

            // close writer
            bufWriter.close();

        } catch (IOException e) {

            // display error message
            System.out.println("Error saving dealership file.");
        }
    }
}