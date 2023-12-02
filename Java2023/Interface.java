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
interface Ap {
    int age = 25;// Final and Static variables
    String name = "TC";

    void show();

    void config();
}

class Bp implements Ap {
    public void show() {
        System.out.println("Show");
    }

    public void config() {
        System.out.println("Config");
    }
}

public class Interface {
    public static void main(String[] args) {
        // Computer lapD = new LaptopD();
        // Computer desk = new Desktop();
        // Dev tc = new Dev();
        // tc.devApp(lapD);
        Ap obj = new Bp();
        obj.config();
        obj.show();
        System.out.println(Ap.name);
    }
}
