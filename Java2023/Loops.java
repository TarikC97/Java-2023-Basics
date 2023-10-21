class Loop {
    public static void main(String args[]) {
        // loops:
        // While Loop
        int i = 1;
        while (i < 5) {
            System.out.println("Test:" + i);
            int j = 1;
            while (j < 4) {
                System.out.println("Hello" + j);
                j++;
            }
            // When Second condition is false, i++ go to first condition.
            i++;
        }
        // Because i<5 is false, when i is 5,prints 5 after while
        // Since i is declared outside of the loop, value will be maintained
        System.out.println("After" + i);

        // Do While Loop
        int p = 5;
        do {
            System.out.println("Do While" + p);
            p++;
        } while (p < 5);

    }
}