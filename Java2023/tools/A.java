package tools;

class Launch {
    public void auto() {
        A obj = new A();
        System.out.println(obj.marks);

    }
}

public class A {
    protected int marks = 5;

    public int show(int a, int b) {
        return a + b;
    }

    public void config() {
        System.out.println("A config");
    }
}
