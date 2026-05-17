package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class DealershipFileManager {
    // reads the inventory file and creates a dealership object
    public Dealership getDealership() {

        // dealership object that will be loaded from the file
        Dealership dealership = null;

        try {

            // open the inventory file for reading
            BufferedReader bufReader =
                    new BufferedReader(new FileReader("inventory.csv"));

            // read the dealership information line
            String dealershipLine = bufReader.readLine();

            // split the dealership line using pipe delimiters
            String[] dealershipParts = dealershipLine.split("\\|");

            // create the dealership object using data from the file
            dealership = new Dealership(
                    dealershipParts[0],
                    dealershipParts[1],
                    dealershipParts[2]
            );
            // variable used to store each vehicle line
            String input;

            // loop through all remaining lines in the file
            while ((input = bufReader.readLine()) != null) {
                // split the vehicle line using pipe delimiters
                String[] vehicleParts = input.split("\\|");

                // convert the text data into proper data types
                int vin = Integer.parseInt(vehicleParts[0]);
                int year = Integer.parseInt(vehicleParts[1]);
                String make = vehicleParts[2];
                String model = vehicleParts[3];
                String vehicleType = vehicleParts[4];
                String color = vehicleParts[5];
                int odometer = Integer.parseInt(vehicleParts[6]);
                double price = Double.parseDouble(vehicleParts[7]);

                // create a vehicle object using the parsed data
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
                // add the vehicle to the dealership inventory
                dealership.addVehicle(vehicle);
            }


        } catch (IOException e) {

            // display error message if file cannot be read
            System.out.println("Error reading inventory file.");

        }

        return dealership;
    }
}