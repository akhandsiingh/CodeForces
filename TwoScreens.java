import java.util.*;

public class TwoScreens{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        while (q-- > 0) {
            String s = sc.next();
            String t = sc.next();

            int n = s.length();
            int m = t.length();

            // Find longest common prefix
            int lcp = 0;
            int minLen = Math.min(n, m);
            while (lcp < minLen && s.charAt(lcp) == t.charAt(lcp)) {
                lcp++;
            }

            int option1 = n + 1 + (m - lcp); // build s, copy, finish t
            int option2 = m + 1 + (n - lcp); // build t, copy, finish s
            int option3 = n + m;             // type both directly

            System.out.println(Math.min(option3, Math.min(option1, option2)));
        }
        sc.close();
    }
}
