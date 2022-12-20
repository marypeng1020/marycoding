/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Ramanujan {
    // Is n a Ramanujan number?
    public static boolean isRamanujan(long n) {
        long a = (long) Math.floor(Math.cbrt(n));

        int x = 0;
        while (a >= 1) {
            long b = Math.round(Math.cbrt((n - a * a * a)));
            if (a * a * a + b * b * b == n) x++;
            if (x >= 2) break;
            a -= 1;
            if (a <= b) break;
        }
        return (x == 2);
    }

    // Takes a long integer command-line arguments n and prints true if
    // n is a Ramanujan number, and false otherwise.
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        System.out.println(isRamanujan(n));
    }
}
