public class Strings {
    public static void main(String args[]) {
        // Creating a string object
        String name = new String("Tarik");
        // System.out.println(name + "Curic");
        // System.out.println(name.charAt(0));
        // System.out.println(name.concat("Muric"));
        // Object is created for us behind the scenes
        // Creates new object with new Adress.
        // Immutable String
        // Once object created it cannot be changed.
        String surname = "Curic";
        surname = surname + "Tarik";
        System.out.println(surname);
        // String Constant Pool in Heap
        // One object for same values strings.
        String s1 = "Ferid";
        String s2 = "Ferid";
        System.out.println(s1 == s2);
    }
}
