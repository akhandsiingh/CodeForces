import java.util.*;

public class CherryBomb{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();

            long[] a = new long[n];
            long[] b = new long[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextLong();
            for (int i = 0; i < n; i++) b[i] = sc.nextLong();

            Long x = null;
            boolean possible = true;

            // Determine x from known b[i]
            for (int i = 0; i < n; i++) {
                if (b[i] != -1) {
                    long curr = a[i] + b[i];
                    if (x == null) x = curr;
                    else if (x != curr) {
                        possible = false;
                        break;
                    }
                }
            }

            if (!possible) {
                System.out.println(0);
                continue;
            }

            // If x is fixed
            if (x != null) {
                for (int i = 0; i < n; i++) {
                    long bi = x - a[i];
                    if (bi < 0 || bi > k) {
                        possible = false;
                        break;
                    }
                    if (b[i] != -1 && b[i] != bi) {
                        possible = false;
                        break;
                    }
                }
                System.out.println(possible ? 1 : 0);
            }
            // If all b[i] are -1
            else {
                long left = Long.MIN_VALUE;
                long right = Long.MAX_VALUE;

                for (int i = 0; i < n; i++) {
                    left = Math.max(left, a[i]);
                    right = Math.min(right, a[i] + k);
                }

                long ans = Math.max(0, right - left + 1);
                System.out.println(ans);
            }
        }
    }
}