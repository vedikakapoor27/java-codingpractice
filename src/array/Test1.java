package array;

    import java.util.*;

    public class Test1 {

        public static void main(String[] args) {

            // Create HashMap
            HashMap<Integer, String> users = new HashMap<>();

            // Add key-value pairs
            users.put(1, "Vedika");
            users.put(2, "Rahul");
            users.put(3, "Amit");

            // Print Map
            System.out.println("Users: " + users);

            // Get value using key
            System.out.println("User with ID 1: " + users.get(1));

            // Loop through map
            System.out.println("All users:");
            for (Integer key : users.keySet()) {
                System.out.println("ID: " + key + " Name: " + users.get(key));
            }

            // Remove a user
            users.remove(2);

            System.out.println("After removal: " + users);
        }
    }

