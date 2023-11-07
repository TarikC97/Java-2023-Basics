class Student {
    int num;
    String name;
    int grades;

}

class Arrays {
    public static void main(String args[]) {
        // int nums[] = { 5, 6, 7 };
        // // int nums2[] = new int[5];
        // for (int i = 0; i < nums.length; i++) {
        // System.out.println(nums[i]);
        // }
        // 3. 3D Array
        // int arr[][][] = new int[3][4][5];
        // for (int j = 0; j < arr.length; j++) {
        // for (int k = 0; k < arr[j].length; k++) {
        // for (int i = 0; i < arr[j][k].length; i++) {
        // arr[j][k][i] = (int) (Math.random() * 10);
        // System.out.print(arr[j][k][i] + " ");
        // }

        // }
        // System.out.println();
        // }
        // 1. Jagged Array
        // int multi[][] = new int[3][];
        // multi[0] = new int[3];
        // multi[1] = new int[4];
        // multi[2] = new int[2];
        // for (int j = 0; j < multi.length; j++) {
        // for (int k = 0; k < multi[j].length; k++) {
        // multi[j][k] = (int) (Math.random() * 10);
        // System.out.print(multi[j][k] + " ");
        // }
        // System.out.println();
        // }
        // 2. Enhanced loop - Multi Dimensional Arrays
        // int multi[][] = new int[3][4];
        // for (int n[] : multi) {
        // for (int m : n) {
        // m = (int) (Math.random() * 10);
        // System.out.print(m + " ");
        // }
        // System.out.println();
        // }
        // Array of Objects
        Student s1 = new Student();
        s1.grades = 7;
        s1.name = "TarikC";
        s1.num = 1;
        Student s2 = new Student();
        s2.grades = 8;
        s2.name = "HarisZ";
        s2.num = 2;
        // Creating array that can hold 2 objects.
        Student students[] = new Student[2];
        students[0] = s1;
        students[1] = s2;
        // Enhanced For Loop(foreach)
        for (Student student : students) {
            System.out.println(student.name + "=" + student.grades);
        }
    }
}