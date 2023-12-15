import java.util.Arrays;
import java.util.List;
// import java.util.function.Function;
// import java.util.stream.Stream;
// import java.util.function.Consumer;
// import java.util.stream.Stream;
// import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(4, 5, 7, 2, 6, 3);
        // Consumer<Integer> con = n -> System.out.println(n);
        // arr.forEach(n -> System.out.println(n));
        // Stream<Integer> s1 = arr.stream();
        // // Stream s1 is used
        // Stream<Integer> s2 = s1.filter(ar -> ar % 2 == 0);
        // Stream<Integer> s3 = s2.map(el -> el * 2);
        // int rez = s3.reduce(0, (c, e) -> c + e);
        // s2.forEach(ar -> System.out.println(ar));
        // s3.forEach(el -> System.out.println(el));
        // Stream can be used only once
        // s1.forEach(ar -> System.out.println(ar));
        // Filter,Map,Reduce methods
        // Predicate<Integer> pred = (n) -> n % 2 == 0;(Filter)
        // Function<Integer, Integer> func = (n) -> n * 2;(Map)
        // int rez = arr.stream()
        // .filter(n -> n % 2 == 0)
        // .map(n -> n * 2)
        // .reduce(0, (c, e) -> c + e);
        // System.out.println(rez);
        // arr.parallelStream()//Filtering multiple threads
        Stream<Integer> sortedVal = arr.stream()
                .filter(n -> n % 2 == 0)
                .sorted();
        sortedVal.forEach(el -> System.out.println(el));

    }
}
