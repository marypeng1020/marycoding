/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class BandMatrix {
    public static void main(String[] args) {
        int width = Integer.parseInt(args[0]);
        int n     = Integer.parseInt(args[1]);

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                if (j < i-n)
                    System.out.print("0  ");
                else if (j <= i + n)
                    System.out.print("*  ");
                else
                    System.out.print("0  ");

            }
            System.out.println();
        }
    }
}
