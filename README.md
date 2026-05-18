# Car Dealership Application

## Description
This is a console-based Java dealership application that allows users to manage a dealership inventory.

The application allows users to:
- Search vehicles by price range
- Search vehicles by make and model
- Search vehicles by year range
- Search vehicles by color
- Search vehicles by mileage range
- Search vehicles by vehicle type
- View all vehicles
- Add vehicles
- Remove vehicles

The dealership inventory is stored in a pipe-delimited CSV file named `inventory.csv`.

---

## Technologies Used
- Java
- IntelliJ IDEA
- Maven
- ArrayList
- File I/O
- Object-Oriented Programming (OOP)

---

## Project Structure
The project contains the following classes:

- `Program`  
  Starts the application.

- `UserInterface`  
  Handles user input, menus, and display output.

- `Dealership`  
  Stores dealership information and vehicle inventory.

- `Vehicle`  
  Represents a vehicle object.

- `DealershipFileManager`  
  Handles reading and writing dealership data to the inventory file.

---

## Features
- Load dealership inventory from file
- Save dealership inventory to file
- Add vehicles
- Remove vehicles
- Multiple search options
- Console-based menu system

---

## How to Run
1. Open the project in IntelliJ IDEA
2. Make sure `inventory.csv` is in the project root directory
3. Run the `Program.java` file
4. Use the console menu to interact with the application

---

## Sample Inventory File
```text
D & B Used Cars|111 Old Benbrook Rd|817-555-5555
10112|1993|Ford|Explorer|SUV|Red|525123|995.0
37846|2001|Ford|Ranger|truck|Yellow|172544|1995.0
44901|2012|Honda|Civic|SUV|Gray|103221|6995.0