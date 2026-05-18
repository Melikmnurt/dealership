package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    // dealership object used throughout the application
    private Dealership dealership;

    // scanner used to read user input
    private Scanner scanner = new Scanner(System.in);

    // displays the main user interface menu
    public void display() {

        // load dealership data from the file
        init();

        // variable used to store the user's menu choice
        int command;

        // main application loop
        do {

            // display menu options
            System.out.println("\nWhat do you want to do?");
            System.out.println("1 - Find vehicles within a price range");
            System.out.println("2 - Find vehicles by make / model");
            System.out.println("3 - Find vehicles by year range");
            System.out.println("4 - Find vehicles by color");
            System.out.println("5 - Find vehicles by mileage range");
            System.out.println("6 - Find vehicles by type");
            System.out.println("7 - List ALL vehicles");
            System.out.println("8 - Add a vehicle");
            System.out.println("9 - Remove a vehicle");
            System.out.println("99 - Quit");

            // prompt user for menu selection
            System.out.print("Enter command: ");

            // read the user's command
            command = scanner.nextInt();

            // clear scanner buffer
            scanner.nextLine();

            // process the user's menu selection
            switch (command) {

                case 1:
                    processGetByPriceRequest();
                    break;

                case 4:
                    processGetByColorRequest();
                    break;

                case 7:
                    processAllVehiclesRequest();
                    break;

                case 99:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid command.");
            }

        } while (true);
    }

    // searches for vehicles within a price range
    private void processGetByPriceRequest() {

        // prompt user for minimum price
        System.out.print("Enter minimum price: ");

        // read minimum price
        double min = scanner.nextDouble();

        // prompt user for maximum price
        System.out.print("Enter maximum price: ");

        // read maximum price
        double max = scanner.nextDouble();

        // clear scanner buffer
        scanner.nextLine();

        // search for matching vehicles
        ArrayList<Vehicle> vehicles =
                dealership.getVehiclesByPrice(min, max);

        // display matching vehicles
        displayVehicles(vehicles);
    }

    // searches for vehicles by color
    private void processGetByColorRequest() {

        // prompt user for vehicle color
        System.out.print("Enter vehicle color: ");

        // read the color entered by the user
        String color = scanner.nextLine();

        // search for matching vehicles
        ArrayList<Vehicle> matchingVehicles =
                dealership.getVehiclesByColor(color);

        // display matching vehicles
        displayVehicles(matchingVehicles);
    }

    // initializes the dealership object
    private void init() {

        // create the file manager object
        DealershipFileManager fileManager =
                new DealershipFileManager();

        // load the dealership from the inventory file
        this.dealership = fileManager.getDealership();
    }

    // displays all vehicles in inventory
    private void processAllVehiclesRequest() {

        // get all vehicles from the dealership
        ArrayList<Vehicle> vehicles =
                dealership.getAllVehicles();

        // display the vehicles
        displayVehicles(vehicles);
    }

    // helper method used to display a list of vehicles
    private void displayVehicles(ArrayList<Vehicle> vehicles) {

        // loop through the vehicle list
        for (Vehicle vehicle : vehicles) {

            // display each vehicle
            System.out.println(vehicle);
        }
    }
}