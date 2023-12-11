
// import java.util.ArrayList;
// import java.util.HashSet;
// import java.util.Collection;
// import java.util.List;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Collections {

    public static void main(String[] args) {
        // Collection
        // Collection<Integer> nums = new ArrayList<Integer>();
        // HashSet - Gives unique values
        // TreeSet - Gives sorted values
        // Collection can be used instead of Set
        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(5);
        // Iterator<Integer> values = nums.iterator();
        // while (values.hasNext()) {
        // System.out.println(values.next());
        // }

        // System.out.println(nums.indexOf(6));
        // System.out.println(nums.get(1));
        // for (int num : nums) {
        // System.out.println(num);
        // }
        // System.out.println(nums);

    }
}