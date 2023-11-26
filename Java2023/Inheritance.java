//SuperClass
class Calc {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

// SubClass
class AdvCalc extends Calc {
    public int multi(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int c1 = obj.add(5, 5);
        int c2 = obj.division(10, 5);
        System.out.println(c1 + ":" + c2);
    }
}
