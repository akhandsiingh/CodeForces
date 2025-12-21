import java.util.*;

public class ForbiddenSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String S = sc.next();
            String T = sc.next();

            int[] freq = new int[26];
            for (char ch : S.toCharArray()) {
                freq[ch - 'a']++;
            }

            if (!T.equals("abc") || freq[0] == 0 || freq[1] == 0 || freq[2] == 0) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 26; i++) {
                    while (freq[i]-- > 0) {
                        sb.append((char) ('a' + i));
                    }
                }
                System.out.println(sb.toString());
            } else {
                StringBuilder sb = new StringBuilder();
                while (freq[0]-- > 0) sb.append('a');
                while (freq[2]-- > 0) sb.append('c');
                while (freq[1]-- > 0) sb.append('b');
                for (int i = 3; i < 26; i++) {
                    while (freq[i]-- > 0) {
                        sb.append((char) ('a' + i));
                    }
                }

                System.out.println(sb.toString());
            }
        }
    }
}
