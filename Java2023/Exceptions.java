public class Exceptions {
    public static void main(String[] args) {
        // Compile time error
        // System.out.Println("Test");
        // Logical error
        // 2+2 = 5 (Eve)
        // Runtime errors
        // Your app opens file , and that file is no longer there
        // That's runtime error, execution will stop in between
        int i = 2;
        int j = 0;
        int arr[] = new int[5];
        String str = null;
        try {
            j = 18 / i;
            System.out.println(str.length());
            System.out.println(arr[1]);
            System.out.println(arr[5]);
        } catch (ArithmeticException obj) {

            System.out.println("Something went wrong!" + obj);
        } catch (ArrayIndexOutOfBoundsException obj) {
            System.out.println("Stay in your limit");
        } catch (Exception e) {
            System.out.println("Something Went wrong" + e);
        }
        System.out.println(j);
        System.out.println("Test");
    }
}
