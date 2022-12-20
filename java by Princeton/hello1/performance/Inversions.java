/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Inversions {
    // Return the number of inversions in the permutation a[].
    public static long count(int[] a) {
        long k = 0;
        long n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i < j) && a[i] > a[j]) k++;
            }
        }
        return k;
    }

    // Return a permutation of length n with exactly k inversions.
    public static int[] generate(int n, long k) {
        int[] b = new int[n];
        int j = 0;
        long t = k;
        int m = n-1;
        for (int i = 0; i < n; i++) {
            if (t >= m) {
                b[i] = m;
                t -= m;
                m -= 1;
                j++;
            }
            else {
                b[i] = i - j;
            }
        }
        for (int s = 0; s < t; s++) {
            int helper = b[n - 1];
            b[n - 1] = b[n - 2];
            b[n - 2] = helper;
            n -= 1;
        }
        return b;

    }
    // Takes an integer n and a long k as command-line arguments,
    // and prints a permutation of length n with exactly k inversions.
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long k = Long.parseLong(args[1]);
        int[] a = generate(n, k);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");


        }
    }
    }

