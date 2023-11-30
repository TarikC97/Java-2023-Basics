// class LaptopA {
//     String model;
//     int price;

//     public String toString() {
//         return model + ":" + price;
//     }

//     // public boolean equals(LaptopA obj3) {
//     // return this.model.equals(obj3.model) && this.price == obj3.price;
//     // }
// }
class AB {
    public void show1() {
        System.out.println("AB Class");
    }
}

class BA extends AB {
    public void show2() {
        System.out.println("BA Class");
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        // LaptopA obj = new LaptopA();
        // obj.model = "Lenovo 330ik";
        // obj.price = 400;
        // LaptopA obj2 = new LaptopA();
        // obj2.model = "Lenovo 330ik";
        // obj2.price = 400;
        // boolean result = obj.equals(obj2);
        // System.out.println(result);
        // Upcasting and Downcasting
        // double d = 4.5;
        // int i = (int) d;// TypeCasting
        // System.out.println(i);
        // UpCasting
        // AB obj = (AB) new BA();
        // obj.show1();
        // // DownCasting
        // BA obj2 = (BA) obj;
        // obj2.show2();

        // Wrapper Class
        int num = 5;
        Integer num1 = num;
        System.out.println(num1);
        int num2 = num1.intValue();
        String str = "15";
        int num3 = Integer.parseInt(str);
        System.out.println(num3 * 12);
    }
}
