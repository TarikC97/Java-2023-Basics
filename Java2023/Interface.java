// interface Computer {
//     void code();
// }

// class LaptopD implements Computer {
//     public void code() {
//         System.out.println("Compile, run , code");
//     }
// }

// class Desktop implements Computer {
//     public void code() {
//         System.out.println("Faster than Laptop");
//     }
// }

// class Dev {

//     public void devApp(Computer comp) {
//         comp.code();
//     }
// }
// interface Ap {
//     int age = 25;// Final and Static variables
//     String name = "TC";

//     void show();

//     void config();
// }

// interface Cp {
//     void run();
// }

// interface Dp extends Cp {
// }

// class Bp implements Ap, Dp {
//     public void show() {
//         System.out.println("Show");
//     }

//     public void config() {
//         System.out.println("Config");
//     }

//     public void run() {
//         System.out.println("Run");
//     }
// }
@FunctionalInterface
interface F {
    // void show();
    // void show(int a);
    int add(int b, int c);
}

// class FB implements F {
// public void show() {
// System.out.println("Show FB");
// }
// }

public class Interface {
    public static void main(String[] args) {
        // Computer lapD = new LaptopD();
        // Computer desk = new Desktop();
        // Dev tc = new Dev();
        // tc.devApp(lapD);
        // Ap obj = new Bp();
        // obj.config();
        // obj.show();
        // System.out.println(Ap.name);
        // Functional Interface
        // Lambda Expressions
        // You don't need to mention variable type
        F obj = (b, c) -> b + c;
        int d = obj.add(5, 5);
        System.out.println(d);
        // Type of Interfaces
        // Normal, Functional, Marker

    }
}
