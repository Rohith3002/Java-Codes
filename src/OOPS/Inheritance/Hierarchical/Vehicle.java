package OOPS.Inheritance.Hierarchical;

public class Vehicle {

    Vehicle(){  // Default Constructor
        System.out.println("DC Vehicle");
    }

    void vehicleHasTopSpeed(){
        System.out.println("Yeah from "+getClass().getSimpleName());
    }
}