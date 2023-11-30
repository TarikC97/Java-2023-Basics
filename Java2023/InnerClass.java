class N {
    int age;

    public void show() {
        System.out.println("Show");
    }

    static class M {
        public void config() {
            System.out.println("Config");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        N obj = new N();
        // N.M obj1 = obj.new M();
        N.M obj1 = new N.M();
        obj1.config();

    }
}
