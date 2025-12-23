import java.util.*;

public class MinMex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String s = sc.next();
                int zeroBlocks = 0;
                if (s.length() > 0 && s.charAt(0) == '0') {
                    zeroBlocks++;
                }
                for (int i = 1; i < s.length(); i++) {
                    if (s.charAt(i) == '0' && s.charAt(i - 1) != '0') {
                        zeroBlocks++;
                    }
                }
                System.out.println(Math.min(zeroBlocks, 2));
            }
        }
        sc.close();
    }
}