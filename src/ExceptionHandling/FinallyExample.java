package ExceptionHandling;

public class FinallyExample {

        public static void main(String[] args) {

            try {
                int a = 10 / 0;
            } catch (Exception e) {
                System.out.println("Error occurred");
            } finally {
                // This always runs
                System.out.println("Finally block executed");
            }
        }
    }

