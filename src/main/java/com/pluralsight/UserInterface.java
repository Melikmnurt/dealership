package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    // dealership object used throughout the application
    private Dealership dealership;

    // scanner used for user input
    private Scanner scanner = new Scanner(System.in);

    // displays the user interface menu
    public void display() {

        // load dealership data
        init();

        int command;

        // main application loop
        do {

            // display menu
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

            // prompt user for command
            System.out.print("Enter command: ");

            command = scanner.nextInt();
            scanner.nextLine();

            // process command
            switch (command) {

                case 1:
                    processGetByPriceRequest();
                    break;

                case 2:
                    processGetByMakeModelRequest();
                    break;

                case 3:
                    processGetByYearRequest();
                    break;

                case 4:
                    processGetByColorRequest();
                    break;

                case 5:
                    processGetByMileageRequest();
                    break;

                case 6:
                    processGetByTypeRequest();
                    break;

                case 7:
                    processAllVehiclesRequest();
                    break;

                case 8:
                    processAddVehicleRequest();
                    break;

                case 9:
                    processRemoveVehicleRequest();
                    break;

                case 99:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid command.");
            }

        } while (true);
    }

    // initializes dealership object
    private void init() {

        // create file manager
        DealershipFileManager fileManager =
                new DealershipFileManager();

        // load dealership
        dealership = fileManager.getDealership();
    }

    // displays all vehicles
    private void processAllVehiclesRequest() {

        ArrayList<Vehicle> vehicles =
                dealership.getAllVehicles();

        displayVehicles(vehicles);
    }

    // searches vehicles by price range
    private void processGetByPriceRequest() {

        System.out.print("Enter minimum price: ");
        double min = scanner.nextDouble();

        System.out.print("Enter maximum price: ");
        double max = scanner.nextDouble();

        scanner.nextLine();

        ArrayList<Vehicle> vehicles =
                dealership.getVehiclesByPrice(min, max);

        displayVehicles(vehicles);
    }

    // searches vehicles by make and model
    private void processGetByMakeModelRequest() {

        System.out.print("Enter vehicle make: ");
        String make = scanner.nextLine();

        System.out.print("Enter vehicle model: ");
        String model = scanner.nextLine();

        ArrayList<Vehicle> vehicles =
                dealership.getVehiclesByMakeModel(make, model);

        displayVehicles(vehicles);
    }

    // searches vehicles by year range
    private void processGetByYearRequest() {

        System.out.print("Enter minimum year: ");
        int min = scanner.nextInt();

        System.out.print("Enter maximum year: ");
        int max = scanner.nextInt();

        scanner.nextLine();

        ArrayList<Vehicle> vehicles =
                dealership.getVehiclesByYear(min, max);

        displayVehicles(vehicles);
    }

    // searches vehicles by color
    private void processGetByColorRequest() {

        System.out.print("Enter vehicle color: ");
        String color = scanner.nextLine();

        ArrayList<Vehicle> vehicles =
                dealership.getVehiclesByColor(color);

        displayVehicles(vehicles);
    }

    // searches vehicles by mileage range
    private void processGetByMileageRequest() {

        System.out.print("Enter minimum mileage: ");
        int min = scanner.nextInt();

        System.out.print("Enter maximum mileage: ");
        int max = scanner.nextInt();

        scanner.nextLine();

        ArrayList<Vehicle> vehicles =
                dealership.getVehiclesByMileage(min, max);

        displayVehicles(vehicles);
    }

    // searches vehicles by type
    private void processGetByTypeRequest() {

        System.out.print("Enter vehicle type: ");
        String vehicleType = scanner.nextLine();

        ArrayList<Vehicle> vehicles =
                dealership.getVehiclesByType(vehicleType);

        displayVehicles(vehicles);
    }

    // adds a vehicle to inventory
    private void processAddVehicleRequest() {

        System.out.print("Enter VIN: ");
        int vin = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter make: ");
        String make = scanner.nextLine();

        System.out.print("Enter model: ");
        String model = scanner.nextLine();

        System.out.print("Enter vehicle type: ");
        String vehicleType = scanner.nextLine();

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        System.out.print("Enter odometer reading: ");
        int odometer = scanner.nextInt();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        scanner.nextLine();

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

        // add vehicle to dealership
        dealership.addVehicle(vehicle);

        // save updated dealership
        DealershipFileManager fileManager =
                new DealershipFileManager();

        fileManager.saveDealership(dealership);

        System.out.println("Vehicle added successfully.");
    }

    // removes a vehicle from inventory
    private void processRemoveVehicleRequest() {

        System.out.print("Enter VIN of vehicle to remove: ");
        int vin = scanner.nextInt();

        scanner.nextLine();

        Vehicle vehicleToRemove = null;

        // search inventory for matching VIN
        for (Vehicle vehicle : dealership.getAllVehicles()) {

            if (vehicle.getVin() == vin) {

                vehicleToRemove = vehicle;
                break;
            }
        }

        // remove vehicle if found
        if (vehicleToRemove != null) {

            dealership.removeVehicle(vehicleToRemove);

            // save updated inventory
            DealershipFileManager fileManager =
                    new DealershipFileManager();

            fileManager.saveDealership(dealership);

            System.out.println("Vehicle removed successfully.");

        } else {

            System.out.println("Vehicle not found.");
        }
    }

    // helper method used to display vehicle lists
    private void displayVehicles(ArrayList<Vehicle> vehicles) {

        // check if list is empty
        if (vehicles.isEmpty()) {

            System.out.println("No matching vehicles found.");
            return;
        }

        // display each vehicle
        for (Vehicle vehicle : vehicles) {

            System.out.println(vehicle);
        }
    }
}