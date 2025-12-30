import java.util.Scanner;

public class Okea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            if (k == 1) {
                System.out.println("YES");
                for (int i = 1; i <= n; i++) {
                    System.out.println(i);
                }
            } else if (n % 2 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                for (int i = 1; i <= n; i++) {
                    StringBuilder sb = new StringBuilder();
                    int current = i;
                    for (int j = 0; j < k; j++) {
                        sb.append(current);
                        if (j < k - 1) sb.append(" ");
                        current += n;
                    }
                    System.out.println(sb.toString());
                }
            }
        }
    }
}