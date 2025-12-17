import java.util.*;

public class StrongPassword {
    static int typingTime(String s) {
        int time = 2; // first character
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                time += 1;
            } else {
                time += 2;
            }
        }
        return time;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String s = sc.nextLine();
            int bestTime = -1;
            String best = "";

            for (int pos = 0; pos <= s.length(); pos++) {
                for (char c = 'a'; c <= 'z'; c++) {
                    String candidate =
                            s.substring(0, pos) + c + s.substring(pos);
                    int time = typingTime(candidate);

                    if (time > bestTime) {
                        bestTime = time;
                        best = candidate;
                    }
                }
            }

            System.out.println(best);
        }
    }
}
