import java.util.*;

public class PhoneCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        int len = arr[0].length();
        int ans = 0;

        for (int i = 0; i < len; i++) {
            char c = arr[0].charAt(i);
            boolean same = true;

            for (int j = 1; j < n; j++) {
                if (arr[j].charAt(i) != c) {
                    same = false;
                    break;
                }
            }

            if (same) ans++;
            else break;
        }

        System.out.println(ans);
        sc.close();
    }
}
