import java.util.*;

public class SakurakosExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            boolean possible = false;

            // s1 ranges from -a to a, step 2
            for (int s1 = -a; s1 <= a; s1 += 2) {
                // s2 ranges from -b to b, step 2
                for (int s2 = -b; s2 <= b; s2 += 2) {
                    if (s1 + 2 * s2 == 0) {
                        possible = true;
                        break;
                    }
                }
                if (possible) break;
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}
