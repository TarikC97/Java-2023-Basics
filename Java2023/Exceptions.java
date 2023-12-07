//Custom Exception
class CustomException extends Exception {
    public CustomException(String string) {
        // Passing Msg of Exception(e)
        super(string);
    }
}

// Throws keyword
class ThrowsException {
    public void show() throws ClassNotFoundException {
        // try {
        Class.forName("ExceptionsD");
        // } catch (ClassNotFoundException e) {
        // System.out.println("Not able to find a Class" + e);
        // }
    }
}

public class Exceptions {
    public static void main(String[] args) {
        // Compile time error
        // System.out.Println("Test");
        // Logical error
        // 2+2 = 5 (Eve)
        // Runtime errors
        // Your app opens file , and that file is no longer there
        // That's runtime error, execution will stop in between
        // int i = 2;
        // int j = 0;
        // int arr[] = new int[5];
        // String str = null;
        // try {
        // j = 18 / i;
        // System.out.println(str.length());
        // System.out.println(arr[1]);
        // System.out.println(arr[5]);
        // } catch (ArithmeticException obj) {

        // System.out.println("Something went wrong!" + obj);
        // } catch (ArrayIndexOutOfBoundsException obj) {
        // System.out.println("Stay in your limit");
        // } catch (Exception e) {
        // System.out.println("Something Went wrong" + e);
        // }
        // System.out.println(j);
        // System.out.println("Test");
        // Exception Hierarchy
        // Checked and Unchecked Exceptions
        // Sql,IO exceptions(Checked)
        // Runtime(Unchecked)
        // Keyword throw
        // int i = 20;
        // int j = 0;
        // try {
        // j = 18 / i;
        // // Calling catch if j = 0
        // if (j == 0)
        // throw new CustomException("I dont wan't zero!");
        // } catch (CustomException obj) {
        // // Exception Handling
        // j = 18 / 1;
        // System.out.println("That's a default value." + obj);
        // } catch (Exception e) {
        // System.out.println("Something Went wrong" + e);
        // }
        // System.out.println(j);
        // System.out.println("Test");
        // Custom Exception
        // Throws Keyword
        ThrowsException obj1 = new ThrowsException();
        try {
            obj1.show();
        } catch (ClassNotFoundException e) {
            // Print entire stack, which method is calling which method.
            e.printStackTrace();
        }

    }
}
