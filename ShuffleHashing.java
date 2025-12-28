import java.util.*;

public class ShuffleHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            String p = sc.next();
            String h = sc.next();

            if (solve(p, h)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean solve(String p, String h) {
        int n = p.length();
        int m = h.length();

        if (n > m) return false;

        int[] pCount = new int[26];
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        for (int i = 0; i <= m - n; i++) {
            int[] hCount = new int[26];
            for (int j = i; j < i + n; j++) {
                hCount[h.charAt(j) - 'a']++;
            }

            if (Arrays.equals(pCount, hCount)) {
                return true;
            }
        }

        return false;
    }
}