abstract class N {
    // int age;

    public abstract void show();

    public abstract void show2();

    // static class M {
    // public void config() {
    // System.out.println("Config");
    // }
    // }
}

public class InnerClass {
    public static void main(String[] args) {
        // N obj = new N();
        // // N.M obj1 = obj.new M();
        // N.M obj1 = new N.M();
        // obj1.config();
        // AnonymusInnerClass
        // N obj = new N() {
        // public void show() {
        // System.out.println("New Show");
        // }
        // };
        // obj.show();
        // Abstract and AnonymusInnerClass
        N obj = new N() {
            public void show() {
                System.out.println("New Show");
            }

            public void show2() {
                System.out.println("New Show2");
            }
        };
        obj.show();
        obj.show2();
    }
}
