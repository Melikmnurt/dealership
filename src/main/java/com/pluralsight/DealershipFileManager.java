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

        } catch (IOException e) {

            // display error message if file cannot be read
            System.out.println("Error reading inventory file.");

        }

        return dealership;
    }
}