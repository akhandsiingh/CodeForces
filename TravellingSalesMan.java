import java.util.*;

public class TravellingSalesMan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int minX = 0, maxX = 0, minY = 0, maxY = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                minX = Math.min(minX, x);
                maxX = Math.max(maxX, x);
                minY = Math.min(minY, y);
                maxY = Math.max(maxY, y);
            }

            int moves = 2 * (Math.abs(minX) + Math.abs(maxX)
                    + Math.abs(minY) + Math.abs(maxY));

            System.out.println(moves);
        }
    }
}
