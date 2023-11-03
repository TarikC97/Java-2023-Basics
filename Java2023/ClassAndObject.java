class Calculator {
    // Behaviour - Adding two numbers
    // You Design your objects in class
    int a;
    // Instance variable
    int b;
    int c = 5;

    // Methods Overloading
    public int add(int a, int b) {
        // Local variables
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class ClassAndObject {
    public static void main(String args[]) {
        // Objects - Have Properties and Behaviour.
        // Creating new Object of type Calculator
        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();
        int rez = obj.add(5, 5);
        System.out.println("Rezult:" + rez);
        // Local variable
        // int data = 10;
        obj.c = 115;
        System.out.println(obj.c);
        System.out.println(obj1.c);
    }
}
