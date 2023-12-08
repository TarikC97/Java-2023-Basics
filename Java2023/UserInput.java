import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // throws IO Exception
        // int num = System.in.read();
        // We are passing Input Stream object in
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);
        // bf.close();
        // Scanner obj = new Scanner(System.in);
        // int num = obj.nextInt();
        // System.out.println(num);
        int num = 0;
        // BufferedReader br = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            // m = 18 / n;
            // System.out.println("Try Block");
            // br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        // } catch (Exception e) {
        // System.out.println("Something went wrong.");}
        // finally {
        // System.out.println("Finally Block");
        // br.close();

        // }
    }

}
