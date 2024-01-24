package Innerclass;

public class Example1 {

    public static void main(String[] args) {

        Car c = new Car("Lambo 137");
        Car.Engine engine = c.new Engine("400CC"); //calling inner class
        engine.start();
        c.drive();

        // OC.IC ref = OCRef.new IC();
    }
}
class Car {
    String make; // Instance Variables
    // Parameterized Constructor
    public Car(String make) {
        this.make = make;
    }
    // Method
    void drive() {
        System.out.println("You can driver Car");
    }
    public class Engine {

        // Instance Variables
        String horsePower;

        // Parameterized Constructor
        public Engine(String horsePower) {
            this.horsePower = horsePower;
        }
        // Method
        void start() {
            System.out.println("Engine is started!! -> " + make);
        }
    }
}
