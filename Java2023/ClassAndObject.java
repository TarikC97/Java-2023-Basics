class Calculator {
    // Behaviour - Adding two numbers
    // You Design your objects in class
    int a;
    int b;

    // Methods Overloading
    public int add(int a, int b) {
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
        int rez = obj.add(5, 5);
        System.out.println("Rezult:" + rez);
    }
}
