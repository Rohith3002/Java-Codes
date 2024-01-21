package OOPS.Inheritance.Multilevel;

public class Runner1 {
    public static void main(String[] args) {

        Programming p = new Programming(); // Parent Class/ SuperClass / Base Class
        p.printInfo();
        Programming p2 = new Programming("Perl",12);
        p2.printInfo();

    }
}
