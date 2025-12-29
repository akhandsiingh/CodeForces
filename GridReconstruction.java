import java.util.*;
import java.io.*;

public class GridReconstruction {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] grid = new int[2][n];

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    grid[0][i] = 2 * n - i;
                    grid[1][i] = i + 1;
                } else {
                    grid[0][i] = i + 1;
                    grid[1][i] = 2 * n - (i - 1);
                }
            }

            // Adjusting Row 2 to ensure the sequence matches the parity logic
            int low = 1;
            int high = n + 1;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    grid[1][i] = low;
                    low += 2;
                } else {
                    grid[1][i] = high;
                    high += 2;
                }
            }

            low = 2;
            high = n + 2;
            grid[0][0] = 2 * n;
            for (int i = 1; i < n; i++) {
                if (i % 2 == 1) {
                    grid[0][i] = low;
                    low += 2;
                } else {
                    grid[0][i] = high;
                    high += 2;
                }
            }

            // Print the grid
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(grid[i][j] + (j == n - 1 ? "" : " "));
                }
                System.out.println();
            }
        }
    }
}