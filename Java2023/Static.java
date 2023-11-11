class Mobile {
    String brand;
    int price;
    static String name;

    // Static block
    static {
        name = "Phone";
        System.out.println("Static Block");

    }

    public Mobile() {
        brand = "";
        price = 500;
        System.out.println("Constructor");
    }

    // In non static methods you can use static variables.
    public void print() {
        System.out.println(brand + " :" + price + " :" + name);
    }

    // static method
    public static void print2(Mobile obj) {
        System.out.println(obj.brand + " :" + obj.price + " :" + name);
    }
}

public class Static {
    public static void main(String args[]) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1000;
        Mobile.name = "SmartPhone";
        // Two calls to constructor, one to static block
        Mobile obj2 = new Mobile();
        // Mobile obj2 = new Mobile();
        // obj2.brand = "Samsung";
        // obj2.price = 800;
        // Mobile.name = "SmartPhone";
        // Mobile.name = "Phone";
        // obj1.print();
        // obj2.print();
        // Mobile.print2(obj2);
    }
}
