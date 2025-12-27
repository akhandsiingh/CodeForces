import java.util.*;
import java.io.*;

public class Notepad {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            if (solve(n, s)) {
                out.append("YES\n");
            } else {
                out.append("NO\n");
            }
        }
        System.out.print(out);
    }

    private static boolean solve(int n, String s) {
        if (n < 4) return false;

        Map<String, Integer> firstOccurrence = new HashMap<>();

        for (int i = 0; i < n - 1; i++) {
            String pair = s.substring(i, i + 2);
            if (!firstOccurrence.containsKey(pair)) {
                firstOccurrence.put(pair, i);
            } else {
                if (firstOccurrence.get(pair) < i - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}