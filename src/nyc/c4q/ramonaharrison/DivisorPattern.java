package nyc.c4q.ramonaharrison;

/**
 * Ramona Harrison
 * Access Code 2.1
 * DivisorPattern.java
 * This class uses 'for' loops to print a patterned box to the console
 */

public class DivisorPattern {
    public static void main(String[] args) {

        table(5);
    }

    public static void table(int n) {

        for (int i = 1; i <= n; i++) {
            String table = "";

            for (int j = 1; j <= n; j++) {
                if (i % j == 0 || j % i == 0)
                    table = table + "@ ";
                else
                    table = table + "  ";
            }

            System.out.println(table);
        }
    }
}
