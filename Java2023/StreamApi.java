import java.util.Arrays;
import java.util.List;
// import java.util.stream.Stream;
import java.util.function.Consumer;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(4, 5, 7, 2, 6, 3);
        // Consumer<Integer> con = n -> System.out.println(n);
        arr.forEach(n -> System.out.println(n));
        // arr.forEach(a -> System.out.println(a));
        // int sum = 0;
        // for (int a : arr) {
        // if (a % 2 == 0) {
        // a = a * 2;
        // sum = sum + a;
        // }
        // }
        // System.out.println(sum);
    }
}
