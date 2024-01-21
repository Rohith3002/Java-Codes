package OOPS.Inheritance.Hierarchical;

public class Runner {
    public static void main(String[] args) {

        Car c = new Car();
        Truck t = new Truck();
        Vehicle v = new Vehicle();


        Vehicle v1 = new Car();
       // Car c2 = new Vehicle();   Not allowed
       // Truck d = new Vehicle();  Not allowed
        // Car c3 = new Truck();

    }
}