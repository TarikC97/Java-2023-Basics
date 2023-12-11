class A extends Object {
    public A() {
        super();
        System.out.println("Class A");
    }

    public A(int n) {
        super();
        System.out.println("in A int");
    }

    public void show() {
        System.out.println("Show data");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("Main B Class");
    }

    public B(int n) {
        this();// Execute constructor of same Class.
        System.out.println("in B int");
    }
}

public class SuperMethod {
    public static void main(String args[]) {
        // Creating obj of Super class, It calls
        // super and subclass constructor
        // B obj = new B(5);
        // B obj = new B(5);
        // Naming convention
        // Camel casing
        // Anonymous object(Object without name)
        // Object creation
        new A().show();
        new A().show();
        // Reference creation
        // A obj;
        // A obj = new A();
        // obj.show();
    }
}
