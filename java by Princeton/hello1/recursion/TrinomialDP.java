/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class TrinomialDP {

        public static long trinomial(int n, int k) {
            if (n == 0 && k == 0) return 1;
            if (k < -n || k > n) return 0;
            else {
                k = Math.abs(k);
                long[][] memo = new long[n + k +1][k + n + 1];
                memo[0][0] = 1;
                for (int i = 1; i <= n + k; i++) {
                    for (int j = 0; j < k + n; j++) {
                        if (j == 0) {
                            memo[i][j] = 2 * memo [i-1][j+1] + memo[i-1][j];
                        } else {
                            memo[i][j] = memo[i-1][j-1] + memo[i-1][j] + memo[i-1][j+1];
                        }
                    }
                }
                return memo[n][k];
            }
        }
        public static void main(String[] args) {
            int n = Integer.parseInt(args[0]);
            int k = Integer.parseInt(args[1]);
            StdOut.println(trinomial(n, k));
        }
    }

