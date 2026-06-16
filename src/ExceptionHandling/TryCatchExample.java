package ExceptionHandling;

public class TryCatchExample {

        public static void main(String[] args) {

            try {
                int a = 10;
                int b = 0;

                // This will cause error
                int result = a / b;

                System.out.println(result);

            } catch (ArithmeticException e) {
                // Handling error
                System.out.println("Error: Cannot divide by zero");
            }

            System.out.println("Program continues...");
        }
    }

