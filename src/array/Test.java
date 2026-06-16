package array;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");

        // Print list
        System.out.println(fruits);

        // Access element
        System.out.println("First fruit: " + fruits.get(0));

        // Loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Remove element
        fruits.remove("Banana");

        System.out.println("After removal: " + fruits);
    }
}