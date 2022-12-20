/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Minesweeper2 {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        boolean [][] mines = new boolean[m][n];
        int count = 0;
        while (count < k) {
            int a = (int) (m * Math.random());
            int b = n * a / m;

            if (!mines[a][b]) {
                count++;
                mines[a][b] = true;
            }
        }

        int [][] neighbor = new int[m + 2][n + 2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0 && mines[i][j]) {
                    neighbor[0][1]++;
                    neighbor[1][0]++;
                    neighbor[1][1]++;
                }
                else if (i == 0 && mines[0][j]) {
                    neighbor[0][j-1]++;
                    neighbor[0][j+1]++;
                    neighbor[1][j]++;
                    neighbor[1][j-1]++;
                    neighbor[1][j+1]++;
                }
                else if (j == 0 && mines[i][0]) {
                    neighbor[i-1][0]++;
                    neighbor[i+1][0]++;
                    neighbor[i][1]++;
                    neighbor[i-1][1]++;
                    neighbor[i+1][1]++;
                }
                else if (i != 0 && j != 0 && mines[i][j]) {
                    neighbor[i][j-1]++;
                    neighbor[i][j+1]++;
                    neighbor[i+1][j-1]++;
                    neighbor[i+1][j]++;
                    neighbor[i+1][j+1]++;
                    neighbor[i-1][j-1]++;
                    neighbor[i-1][j]++;
                    neighbor[i-1][j+1]++;
                }

            }

        }

        for (int c = 0; c < m; c++) {
            for (int d = 0; d < n; d++) {
                if (mines[c][d])
                    System.out.print("*  ");
                else System.out.print(neighbor[c][d] + "  ");
            }
            System.out.println();
        }

    }
}



