// class I {
//     public void show() {
//         System.out.println("I show");
//     }
// }

// class O extends I {
//     public void show() {
//         System.out.println("In O show");
//     }
// }

// class P extends I {
//     public void show() {
//         System.out.println("P show");
//     }
// }
class Test {
    public final void show() {
        System.out.println("Show Test");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class Test2 extends Test {
    // public void show() {
    // System.out.println("Show Test2");
    // }
}

public class Polymorphism {
    public static void main(String[] args) {
        // We can reffer type of parent for object of child
        // I obj = new I();
        // obj.show();

        // obj = new O();
        // obj.show();

        // obj = new P();
        // obj.show();

        // Final(const) keyword
        // final int num = 8;
        // // num = 9;
        // System.out.println(num);

        Test obj = new Test2();
        obj.show();
        obj.add(3, 4);
    }
}
