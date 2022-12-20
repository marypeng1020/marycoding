/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;

        int step = 0;
        System.out.println("(" + x + "," + y + ")");

        while (Math.abs(x)+ Math.abs(y) < r) {

            double f = Math.random();
            if (f <= 0.25) x++;
            else if (f <= 0.50) x--;
            else if (f <= 0.75) y++;
            else if (f <= 1.00) y--;
            step++;

            System.out.println("(" + x + "," + y + ")");
        }

        System.out.println("steps = " + step);
    }

}
