import java.util.*;
public class DownloadMoreGraph {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();

                int[] a = new int[n];
                int[] b = new int[n];

                for (int i = 0; i < n; i++) a[i] = sc.nextInt();
                for (int i = 0; i < n; i++) b[i] = sc.nextInt();

                int[][] programs = new int[n][2];
                for (int i = 0; i < n; i++) {
                    programs[i][0] = a[i];
                    programs[i][1] = b[i];
                }

                Arrays.sort(programs, (x, y) -> Integer.compare(x[0], y[0]));

                int currentRAM = k;

                for (int i = 0; i < n; i++) {
                    if (programs[i][0] <= currentRAM) {
                        currentRAM += programs[i][1];
                    } else {
                        break;
                    }
                }

                System.out.println(currentRAM);
            }

            sc.close();
        }
    }

