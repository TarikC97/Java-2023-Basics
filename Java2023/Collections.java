import java.util.ArrayList;
import java.util.HashSet;
// import java.util.Collection;
// import java.util.List;
import java.util.Set;

public class Collections {

    public static void main(String[] args) {
        // Collection
        // Collection<Integer> nums = new ArrayList<Integer>();
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(5);
        // System.out.println(nums.indexOf(6));
        // System.out.println(nums.get(1));
        // for (int num : nums) {
        // System.out.println(num);
        // }
        System.out.println(nums);

    }
}