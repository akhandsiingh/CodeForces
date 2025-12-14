import java.util.*;

public class NoCasinoInTheMountains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            int[] pref = new int[n + 1];
            for (int i = 0; i < n; i++) {
                pref[i + 1] = pref[i] + a[i];
            }
  
            int hikes = 0;
            int i = 0;

            while (i + k <= n) {
                int rainy = pref[i + k] - pref[i];

                if (rainy == 0) {
                    hikes++;
                    i += k + 1;
                } else {
                    i++;
                }
            }

            System.out.println(hikes);
        }

        sc.close();
    }
}
