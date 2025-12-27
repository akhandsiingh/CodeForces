import java.util.*;
import java.io.*;

public class DeckOfCards {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String[] firstLine = br.readLine().split(" ");
            int n = Integer.parseInt(firstLine[0]);
            int k = Integer.parseInt(firstLine[1]);
            String s = br.readLine();

            int minTop = 0;
            int maxTop = 0;
            for (int i = 0; i < k; i++) {
                if (s.charAt(i) == '0') {
                    minTop++;
                    maxTop++;
                } else if (s.charAt(i) == '2') {
                    maxTop++;
                }
            }

            char[] result = new char[n];
            for (int i = 1; i <= n; i++) {
                boolean canBeIn = false;
                boolean canBeOut = false;


                int lowerBoundRemain = Math.max(minTop, k - n + i);
                int upperBoundRemain = Math.min(maxTop, i - 1);

                if (lowerBoundRemain <= upperBoundRemain) {
                    canBeIn = true;
                }

                if (maxTop >= i && i >= minTop) {
                    canBeOut = true;
                } else if (minTop >= i) {
                    canBeOut = true;
                }

                int xLimitForBottom = k - n + i - 1;
                if (minTop <= xLimitForBottom && xLimitForBottom <= maxTop) {
                    canBeOut = true;
                } else if (maxTop <= xLimitForBottom) {
                    canBeOut = true;
                }

                if (canBeIn && canBeOut) {
                    result[i - 1] = '?';
                } else if (canBeIn) {
                    result[i - 1] = '+';
                } else {
                    result[i - 1] = '-';
                }
            }
            sb.append(new String(result)).append("\n");
        }
        System.out.print(sb);
    }
}