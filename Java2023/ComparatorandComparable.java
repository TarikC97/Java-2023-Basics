import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorandComparable {
    public static void main(String[] args) {
        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(int i, int j) {
                return 5;
            }
        };
        List<Integer> arr = new ArrayList<>();
        arr.add(43);
        arr.add(21);
        arr.add(52);
        arr.add(15);

        Collections.sort(arr);
        System.out.println(arr);

    }
}
