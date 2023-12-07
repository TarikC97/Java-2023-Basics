import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
        // int num = System.in.read();
        // We are passing Input Stream object in
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);
        // bf.close();
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        System.out.println(num);
    }

}
