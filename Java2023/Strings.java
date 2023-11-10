public class Strings {
    public static void main(String args[]) {
        // Creating a string object
        // String name = new String("Tarik");
        // System.out.println(name + "Curic");
        // System.out.println(name.charAt(0));
        // System.out.println(name.concat("Muric"));
        // Object is created for us behind the scenes
        // Immutable String
        // Once object created it cannot be changed.
        // String surname = "Curic";
        // Creates new object with new Adress.
        // surname = surname + "Tarik";
        // System.out.println(surname);
        // String Constant Pool in Heap
        // One object for same values strings.
        // String s1 = "Ferid";
        // String s2 = "Ferid";
        // System.out.println(s1 == s2);
        // Muttable Strings
        // StringBuffer
        StringBuffer sb = new StringBuffer("Samir");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Curic");
        sb.deleteCharAt(2);
        sb.insert(2, "m");
        sb.setLength(15);
        System.out.println(sb);
        String str = sb.toString();
        // StringBuilder one diff, not thread save
        
    }
}
