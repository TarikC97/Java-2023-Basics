class Human {
    // Instance Variables
    private int age;
    private String name;

    public Human() {// Default Const
        System.out.println("Constructor");
        age = 15;
        name = "Proba";
    }

    public Human(int age, String name) {// Parameterized Const
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Local variable
        // In case of confusion it is always local variable
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj2 = new Human(25, "Tarik");
        // By default null values for unsigned values for variables.
        System.out.println(obj.getName() + ":" + obj.getAge());
        System.out.println(obj2.getName() + ":" + obj2.getAge());
        // obj.setAge(25);
        // obj.setName("Tarik");
        // System.out.println(obj.getName() + ":" + obj.getAge());
    }
}
