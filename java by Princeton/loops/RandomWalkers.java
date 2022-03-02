/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int x = 0;
        int y = 0;
        int step = 0;
        double aver = 0.0;
        double sum = 0.0;

        for (long t = 0; t < trials; t++) {
            x = 0;
            y = 0;
            step = 0;
            while (Math.abs(x) + Math.abs(y) < r) {
                double f = Math.random();
                if (f <= 0.25) x++;
                else if (f <= 0.50) x--;
                else if (f <= 0.75) y++;
                else if (f <= 1.00) y--;
                step++;
            }
            sum += step;
        }
        aver = sum / (trials * 1.0);
        System.out.println("average number of steps = " + aver);
    }
}
