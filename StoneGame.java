import java.util.*;

public class BlockTowers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int minVal = Integer.MAX_VALUE;
            int maxVal = Integer.MIN_VALUE;
            int posMin = -1, posMax = -1;

            for (int i = 0; i < n; i++) {
                if (a[i] < minVal) {
                    minVal = a[i];
                    posMin = i;
                }
                if (a[i] > maxVal) {
                    maxVal = a[i];
                    posMax = i;
                }
            }

            int option1 = Math.max(posMin, posMax) + 1;
            int option2 = Math.max(n - posMin, n - posMax);
            int option3 = Math.min(
                    posMin + 1 + (n - posMax),
                    posMax + 1 + (n - posMin)
            );

            System.out.println(Math.min(option1, Math.min(option2, option3)));
        }
        sc.close();
    }
}
