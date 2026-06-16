package Variable;


    class Test {

        static int value;

        // static block
        static {
            System.out.println("Static block executed");
            value = 100;
        }

        static void display() {
            System.out.println("Value = " + value);
        }
    }

    public class StaticBlockExample {
        public static void main(String[] args) {

            // class loads here
            Test.display();
        }
    }

