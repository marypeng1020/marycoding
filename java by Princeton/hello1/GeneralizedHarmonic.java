/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double sumH = 0.0;

        for (int i = 1; i <= n; i++) {
            double m = Math.pow(i, r);
            sumH += 1.0 / m;

        }
        System.out.println(sumH);


    }
}
