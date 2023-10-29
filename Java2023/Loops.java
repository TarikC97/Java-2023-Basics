class Loop {
    public static void main(String args[]) {
        // loops:
        // While Loop
        // int i = 1;
        // while (i < 5) {
        // System.out.println("Test:" + i);
        // int j = 1;
        // while (j < 4) {
        // System.out.println("Hello" + j);
        // j++;
        // }
        // // When Second condition is false, i++ go to first condition.
        // i++;
        // }
        // Because i<5 is false, when i is 5,prints 5 after while
        // Since i is declared outside of the loop, value will be maintained
        // System.out.println("After" + i);

        // //Do While Loop
        // int p = 5;
        // do {
        // System.out.println("Do While" + p);
        // p++;
        // } while (p < 5);

        // For Loop:
        // (Starting Value;Limit; Counter)
        int i = 1;
        for (; i <= 5;) {
            // It executes startValue, limit, then block
            // At end it executes counter.
            System.out.println("Day:" + i);
            for (int j = 1; j <= 9; j++) {
                System.out.println((j + 8) + "-" + (j + 9));
            }
            i++;
        }

    }
}