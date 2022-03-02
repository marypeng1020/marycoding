/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RevesPuzzle {
    private static void revesPuzzle(int n, char A, char B, char C, char D) {
        if (n == 0) return;
        int k = (int) Math.round(n + 1 - Math.sqrt(2 * n +1));
        revesPuzzle(k, A, D, C, B);
        hanoi(n - k, n, A, C, D);
        revesPuzzle(k, B, A, C, D);
    }
    private static void hanoi(int lok, int n, char start, char mid, char end) {
        if (lok > 0) {
            hanoi(lok - 1, n-1, start, end, mid);
            StdOut.println("Move disc " + n + " from " + start + " to " + end);
            hanoi(lok - 1, n-1, mid, start, end);
        }
    }


    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        revesPuzzle(n, 'A', 'B', 'C', 'D');

    }
}
