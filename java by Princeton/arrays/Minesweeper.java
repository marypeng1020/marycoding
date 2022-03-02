/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        boolean[][] minePositions = new boolean[m + 2][n + 2];
        int[][] grid = new int[m + 2][n + 2];

        int num = 0;
        while (num != k) {
            if ((m * n) == k) {
                for (int f = 1; f <= m; f++) {
                    for (int z = 1; z <= n; z++) {
                        minePositions[f][z] = true;
                    }
                } break;
            }

            int r = (int) (Math.random() * ((m + 2) * (n + 2)));
            int q = r / (n + 2);
            int rem = r % (n + 2);

            if (q > 0 && q <= m && rem > 0 && rem <= n && !minePositions[q][rem]) {
                minePositions[q][rem] = true;
                num++;
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (minePositions[i - 1][j + 1]) grid[i][j]++;
                if (minePositions[i][j + 1]) grid[i][j]++;
                if (minePositions[i + 1][j + 1]) grid[i][j]++;
                if (minePositions[i - 1][j]) grid[i][j]++;
                if (minePositions[i + 1][j]) grid[i][j]++;
                if (minePositions[i - 1][j - 1]) grid[i][j]++;
                if (minePositions[i][j - 1]) grid[i][j]++;
                if (minePositions[i + 1][j - 1]) grid[i][j]++;
            }
            for (int j = 1; j <= n; j++) {
                if (minePositions[i][j]) System.out.print("*  ");
                else System.out.print(grid[i][j] + "  ");
            }
            System.out.print("\n");
        }


    }
}
