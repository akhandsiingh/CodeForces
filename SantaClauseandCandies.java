import java.util.*;

public class SantaClauseandCandies{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> result = new ArrayList<>();

        int current = 1;
        while (n >= current) {
            n -= current;
            result.add(current);
            current++;
        }

        int lastIdx = result.size() - 1;
        int lastValue = result.get(lastIdx);
        result.set(lastIdx, lastValue + n);

        System.out.println(result.size());
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + (i == result.size() - 1 ? "" : " "));
        }
    }
}