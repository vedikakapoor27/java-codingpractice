package method;

// Class demonstrating method overloading
class Calculator2{

    // Method with 3 integers
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    // Method with 2 integers
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    // Method with double and int
    public double add(double n1, int n2) {
        return n1 + n2;
    }
}

// Main class
public class Demo2 {

    public static void main(String[] args) {

        // Creating object of Demo2
        Calculator2 calc = new Calculator2();

        // Calling overloaded methods
        int r1 = calc.add(10, 20);            // calls add(int, int)
        int r2 = calc.add(5, 15, 25);         // calls add(int, int, int)
        double r3 = calc.add(10.5, 5);        // calls add(double, int)

        // Printing results
        System.out.println("Sum of 2 ints: " + r1);
        System.out.println("Sum of 3 ints: " + r2);
        System.out.println("Double + int result: " + r3);
    }
}
