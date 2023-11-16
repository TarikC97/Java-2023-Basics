class Human {
    // Instance Variables
    private int age;
    private String name;

    public Human() {
        System.out.println("Constructor");
        age = 15;
        name = "Proba";
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
        // By default null values for unsigned values for variables.
        System.out.println(obj.getName() + ":" + obj.getAge());
        obj.setAge(25);
        obj.setName("Tarik");
        // System.out.println(obj.getName() + ":" + obj.getAge());
    }
}
