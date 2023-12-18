// class AlienR {
//     private final int id;
//     private final String name;

//     public AlienR(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     // Method needed to compare values of two objects
//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + id;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         AlienR other = (AlienR) obj;
//         if (id != other.id)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }

//     // Msethod needed to override obj printing data.
//     @Override
//     public String toString() {
//         return "AlienR [id=" + id + ", name=" + name + "]";
//     }

//}
record AlienR(int id, String name) {
    // public AlienR() {
    // // Setting defualt value for default constructor
    // // if(id ==0)
    // // throw new IllegalArgumentException("Id can't be zero");
    // // this(0, "");
    // }
}

public class Record {
    public static void main(String[] args) {
        AlienR obj = new AlienR(25, "Tc");
        AlienR obj2 = new AlienR(25, "Tc");
        System.out.println(obj.equals(obj2));
        // AlienR obj3 = new AlienR();
    }

}
