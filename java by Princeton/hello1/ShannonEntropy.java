/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] f = new int[m + 1];
        int n = 0;

        // calculating the frequency by incrementing the array and incrementing n alongside
        while (!StdIn.isEmpty()) {
            int value = StdIn.readInt();
            f[value]++;
            n++;
        }

        double entropy = 0;
        for (int i = 1; i <= m; i++) {
            double p = (double) f[i] / n;
            if (f[i] > 0)
                entropy -= p * (Math.log(p) / Math.log(2));

        }


        // printing the output
        StdOut.printf(("%.4f"), entropy);

    }
}
