import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] freq = new int[n + 1]; 

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x <= n) freq[x]++;
            }

            int deletions = 0;

            for (int x = 0; x <= n; x++) {
                int f = freq[x];

                if (f == 0) continue;
                if (f < x) {
                    deletions += f;
                }
                else {
                    int keepCost = f - x;  
                    int removeCost = f;   
                    deletions += Math.min(keepCost, removeCost);
                }
            }

            System.out.println(deletions);
        }
    }
}
