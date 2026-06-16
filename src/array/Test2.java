package array;

    import java.util.*;

    public class Test2 {

        public static void main(String[] args) {

            // Create HashSet
            HashSet<Integer> numbers = new HashSet<>();

            // Add elements
            numbers.add(10);
            numbers.add(20);
            numbers.add(10); // duplicate (ignored)

            // Print set
            System.out.println("Set: " + numbers);

            // Check if element exists
            if (numbers.contains(20)) {
                System.out.println("20 is present");
            }

            // Loop through set
            System.out.println("All elements:");
            for (int num : numbers) {
                System.out.println(num);
            }

            // Remove element
            numbers.remove(10);

            System.out.println("After removal: " + numbers);
        }
    }
}
