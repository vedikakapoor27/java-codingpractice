package Variable;

    class MathUtil {

        // static method
        static int add(int a, int b) {
            return a + b;
        }
    }

    public class StaticMethodExample {
        public static void main(String[] args) {

            // calling without object
            int result = MathUtil.add(10, 20);

            System.out.println("Sum = " + result);
        }
    }

