
// import java.util.ArrayList;
// import java.util.HashSet;
// import java.util.Collection;
// import java.util.List;
// import java.util.Iterator;
// import java.util.Set;
// import java.util.TreeSet;
import java.util.HashMap;
// import java.util.Hashtable;
import java.util.Map;

public class Collections {

    public static void main(String[] args) {
        // Collection
        // Collection<Integer> nums = new ArrayList<Integer>();
        // HashSet - Gives unique values
        // TreeSet - Gives sorted values
        // Collection can be used instead of Set
        // Set<Integer> nums = new TreeSet<Integer>();
        // nums.add(6);
        // nums.add(5);
        // nums.add(5);
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

        // Map-Is a collection of a key value pair.
        // Keys are unique
        Map<String, Integer> students = new HashMap<>();
        // Map<String, Integer> students2 = new Hashtable<>();
        students.put("Tc", 25);
        students.put("Ac", 24);
        students.put("Zh", 26);
        students.put("Eh", 27);
        students.put("Eh", 25);
        // System.out.println(students.get("Tc"));
        // Method to get all the keys
        // System.out.println(students.keySet());
        // All values
        // System.out.println(students.values());
        for (String key : students.keySet()) {
            System.out.println(key + ":" + students.get(key));
        }

    }
}