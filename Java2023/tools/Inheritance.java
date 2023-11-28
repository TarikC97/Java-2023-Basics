package tools;
//SuperClass

// class Calc {
//     public int add(int a, int b) {
//         return a + b;
//     }

//     public int sub(int a, int b) {
//         return a - b;
//     }
// }

// // SingleLEvelInheritance
// // SubClass
// class AdvCalc extends Calc {
//     public int multi(int a, int b) {
//         return a * b;
//     }

//     public int division(int a, int b) {
//         return a / b;
//     }
// }

// // Multi level Inheritance
// class VeryAdvCalc extends AdvCalc {
//     public double pow(int a, int b) {
//         return Math.pow(a, b);
//     }
// }

class A {
    public int show(int a, int b) {
        return a + b;
    }

    public void config() {
        System.out.println("A config");
    }
}

class B extends A {
    // Method Overriding
    public int show(int a, int b) {
        return a + b + 6;
    }
}
// Java DOesn't support Mulltiple Inheritance
// class C extends A,B {
// }int c = obj.show(5, 4);
// System.out.println(c);

public class Inheritance {
    public static void main(String[] args) {
        // VeryAdvCalc obj = new VeryAdvCalc();
        // int c1 = obj.add(5, 5);
        // int c2 = obj.division(10, 5);
        // double c3 = obj.pow(5, 2);
        // System.out.println(c1 + ":" + c2 + ":" + c3);
        B obj = new B();
        int c = obj.show(5, 4);
        System.out.println(c);
        obj.config();
    }
}
