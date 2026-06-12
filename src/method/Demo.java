package method; // package name

// Calculator is a class
class Calculator {

    // This is a method named add
    // public -> access modifier
    // int -> return type, this method returns an integer value
    // add -> method name
    // int n1, int n2 ->input values
    public int add(int n1, int n2) {

        // local variable r stores the sum of n1 and n2
        int r = n1 + n2;

        // returns the result back to where the method was called
        return r;
    }
}

// Demo is the main class
public class Demo {

    // This is the main method
    // Program execution starts from here
    public static void main(String[] args) {

        // primitive variables
        int num1 = 4;
        int num2 = 5;

        // creating an object of Calculator class
        // new keyword creates the object in heap memory
        // calc is a reference variable that refers to the object
        Calculator calc = new Calculator();

        // calling the add method using the object calc
        // num1 and num2 are passed as arguments
        // returned value is stored in result
        int result = calc.add(num1, num2);

        // prints the result
        System.out.println(result);
    }
}