## A. Project Overview

The system models different types of vehicles using a common abstract superclass and shows how drivers are associated with vehicles. The project also demonstrates working with arrays of objects in an inheritance-based design.

## B. Class Hierarchy and Design

### Vehicle (Abstract Class)

`Vehicle` is an abstract superclass that contains common fields and behavior shared by all vehicles.

Fields:
- brand (String)
- year (int)

Methods:
- startEngine() – abstract
- stopEngine() – abstract
- displayInfo() – concrete method that prints vehicle information

The fields are declared as protected to allow access in subclasses while maintaining encapsulation.

### Subclasses

The following classes extend the `Vehicle` class:

**Car**
- Additional fields: doors, fuelType
- Overrides startEngine() and stopEngine()

**Motorcycle**
- Additional field: hasSidecar
- Overrides startEngine() and stopEngine()

**Truck**
- Additional fields: capacity, numAxles
- Overrides startEngine() and stopEngine()

Each subclass uses constructor chaining with the `super` keyword to initialize the inherited fields.

### Driver Class

The `Driver` class represents a vehicle driver.

Fields:
- name
- licenseNumber

Methods:
- displayDriverInfo()

Each `Vehicle` has a `Driver` object (composition). At the same time, one `Driver` can be associated with multiple vehicles, which demonstrates aggregation.

### Polymorphism

An array of type `Vehicle` is used in the main program to store objects of different subclasses. When methods like startEngine() and stopEngine() are called in a loop, the correct overridden version is executed based on the object type.

## C. Compilation and Execution Instructions

Navigate to the `src` directory and compile all Java files:
javac *.java


Run the program using:



java Main


## D. Screenshots

Screenshots of the program output demonstrating correct vehicle behavior and driver information are located in:



docs/screenshots/


They show:
- Engine start and stop for each vehicle
- Vehicle information output
- Assigned driver information

## E. Reflection

Using inheritance significantly simplified the design of the system by allowing common fields and methods to be written once in the Vehicle class instead of being duplicated in each vehicle type. This made the code cleaner and easier to maintain.

Method overriding allowed each subclass to define its own engine behavior while still using the same method names. One challenge was correctly choosing between protected and private access modifiers, especially when deciding which fields should be accessible in subclasses without breaking encapsulation.


## Submission

The project is submitted as a public GitHub repository.  
The repository link is attached in Moodle as required.

