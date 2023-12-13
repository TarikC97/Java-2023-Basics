import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class StudentC implements Comparable<StudentC> {
    int age;
    String name;

    public StudentC(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("Constructor");
    }

    public String toString() {
        return "StudentC [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(StudentC that) {
        // Method for sorting by second value(21,12,13)
        // if i > j , swap them
        // Getting last number(43 -> gets 3) i %10
        if (this.age % 10 > that.age % 10) {
            // return 1 swap
            return 1;
            // if i< j don't swap
        } else
            return -1;
    }

}

public class ComparatorandComparable {
    public static void main(String[] args) {
        // Comparator<Integer> comp = new Comparator<Integer>()
        Comparator<StudentC> comp = (obj1, obj2) -> obj1.age > obj2.age ? 1 : -1;
        // List<Integer> arr = new ArrayList<>();
        // arr.add(43);
        // arr.add(21);
        // arr.add(52);
        // arr.add(15);
        List<StudentC> stud = new ArrayList<>();
        stud.add(new StudentC(25, "Tc"));
        stud.add(new StudentC(24, "Ac"));
        stud.add(new StudentC(26, "Eh"));
        stud.add(new StudentC(21, "Rh"));
        Collections.sort(stud, comp);
        for (StudentC st : stud) {
            System.out.println(st);
        }

    }
}
