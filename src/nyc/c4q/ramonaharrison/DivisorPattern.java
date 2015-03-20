package nyc.c4q.ramonaharrison;

/**
 * Ramona Harrison
 * Access Code 2.1
 * DivisorPattern.java
 * This class uses 'for' loops to print a patterned box to the console
 */

public class DivisorPattern {
    public static void main(String[] args) {

        box(10);
    }

    public static void box(int n) {

        for (int i = 1; i <= n; i++) {
            String box = "";

            for (int j = 1; j <= n; j++) {
                if (i % j == 0 || j % i == 0)
                    box = box + "@ ";
                else
                    box = box + "  ";
            }

            System.out.println(box);
        }
    }
}
