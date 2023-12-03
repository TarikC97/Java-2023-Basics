enum LaptopE {
    Macbook(2000), XPS(1500), Surface(), ThinkPad(1200);

    private int price;

    private LaptopE() {
        this.price = 1000;
    }

    private LaptopE(int price) {
        this.price = price;
        System.out.println("In Laptop");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Enums {
    public static void main(String[] args) {
        // Status s = Status.Success;// Named Constant
        // System.out.println(s.ordinal());
        // Status[] array = Status.values();
        // // System.out.println(array[0]);
        // for (Status status : array) {
        // System.out.println(status + " :" + status.ordinal());
        // }
        // Status s = Status.Success;
        // switch (s) {
        // case Running:
        // System.out.println("Good");
        // break;
        // case Failed:
        // System.out.println("Try Again");
        // break;
        // case Pending:
        // System.out.println("Waiting");
        // break;
        // default:
        // System.out.println("Works");
        // break;
        // }
        // if (s == Status.Running)
        // System.out.println("Good");
        // else if (s == Status.Failed)
        // System.out.println("Try again");

        // else if (s == Status.Pending)
        // System.out.println("Please Wait");
        // else
        // System.out.println("Done");
        // Enum Class
        // System.out.println(s.getClass().getSuperclass());
        // LaptopE lap = LaptopE.Macbook;
        // System.out.println(lap + "" + lap.getPrice());
        for (LaptopE lap : LaptopE.values()) {
            System.out.println(lap + "" + lap.getPrice());
        }

    }
}
