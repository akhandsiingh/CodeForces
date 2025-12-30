import java.util.*;

public class Okea{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            // Impossible case
            if (k % 2 == 1 && k > 1) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");

            int[][] grid = new int[n][k];
            int num = 1;

            // Fill column-wise
            for (int j = 0; j < k; j++) {
                for (int i = 0; i < n; i++) {
                    grid[i][j] = num++;
                }
            }

            // Print grid
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < k; j++) {
                    System.out.print(grid[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
