package ExceptionHandling;

public class ThrowExample {

        public static void main(String[] args) {

            int age = 16;

            if (age < 18) {
                // Manually throwing exception
                throw new ArithmeticException("Not eligible for vote");
            }

            System.out.println("Eligible");
        }
    }

