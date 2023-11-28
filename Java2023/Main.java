
// import java.util.ArrayList;
import tools.A;
// import tools.B;
// import tools.others.*;
// import java.lang.*; //By defualt imported

//Protected - can be accessed as subclass in other package.
class P extends A {
    public void auto() {
        System.out.println(marks);
    }
}

public class Main {
    public static void main(String[] args) {
        // ArrayList arr = new ArrayList<>();
        // B obj = new B();
        // int c = obj.show(5, 4);
        // System.out.println(c);
        // D obj1 = new D();
        A obj = new A();
        // System.out.println(obj.marks);
    }
}
