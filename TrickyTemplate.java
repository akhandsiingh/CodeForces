import java.util.*;

public class TrickyTemplate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();

            boolean possible = false;

            for (int i = 0; i < n; i++) {
                if (c.charAt(i) != a.charAt(i) && c.charAt(i) != b.charAt(i)) {
                    possible = true;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}
