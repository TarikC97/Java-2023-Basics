public class Exceptions {
    public static void main(String[] args) {
        // Compile time error
        // System.out.Println("Test");
        // Logical error
        // 2+2 = 5 (Eve)
        // Runtime errors
        // Your app opens file , and that file is no longer there
        // That's runtime error, execution will stop in between
        int i = 0;
        int j = 0;
        try {
            j = 18 / i;
        } catch (Exception obj) {
            System.out.println("Something went wrong!" + obj);
        }
        System.out.println(j);
        System.out.println("Test");
    }
}
