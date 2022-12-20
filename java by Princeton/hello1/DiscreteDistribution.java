/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class DiscreteDistribution {
    public static void main(String[] args) {
        int n = args.length;
        int [] a = new int [n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i]);
        }
        int [] s = new int [n];
        for (int i = 1; i < n; i++) {
            s[0] = 0;
            s[i] = s[i-1] + a[i];
        }
        for (int m = 0; m < a[0]; m++) {
            int index = 1;
            int r = (int) (s[n-1] * Math.random());
            for (int i = 1; i < n; i++) {
                if (s[i-1] <= r && r < s[i])
                    index = i;
            }
            System.out.print(index + " ");
        }
    }
}
