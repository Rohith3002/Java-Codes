package CollectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example1{
    public static void main(String[] args) {
        // Collections Framework
        List fruits = List.of("orange", "apple", "banana", "apple", "watermelon");
        List shopping_items = List.of("AATA", "MILK", "BREAD", "butter", "choc silk");
        List my_10th_makrs = List.of(91, 92, 93, 95, 100);
        List different_data_types = List.of("Pramod",true,123);

        System.out.println(fruits.get(0));
        System.out.println(fruits.size());
        System.out.println(fruits);
        System.out.println(fruits.indexOf("banana"));


        // IsEmpty
        System.out.println(fruits.isEmpty());
       // fruits.add("pramod");
        fruits.remove("pramod");
        // ArrayList, LinkedList, - Add or Replace anything - Full Auth




    }
}