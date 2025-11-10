package patterns;

public class PatternProblame13 {
    public static void main(String[] args) {
        int n = 5; // height of the top half

        // Upper half (including middle row)
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();

            // print middle row again (when i == n)
            if (i == n) {
                // spaces again
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }
                // increasing numbers
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                // decreasing numbers
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
