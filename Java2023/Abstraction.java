abstract class Car {
    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("Music");
    }
}

abstract class Audi extends Car {
    // public void drive() {
    // System.out.println("Drive Audi");
    // }

    public void fly() {
        System.out.println("Fly Audi");
    }
}

// Concrete class
class UpdatedAudi extends Audi {
    public void drive() {
        System.out.println("Drive Audi");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Car obj = new UpdatedAudi();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }

}
