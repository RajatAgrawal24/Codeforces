
import java.util.*;

public class SolutionD {

    public static long minSwaps(String s, char c) {
        int n = s.length();
        List<Integer> pos = new ArrayList<>();
        for (int i=0;i<n;i++) {
            if (s.charAt(i) == c) pos.add(i);
        }
        int m = pos.size();
        if (m <= 1) return 0;

        int mid = m / 2;
        long cost = 0;
        for (int i=0;i<m;i++) {
            // align pos[i] to consecutive block centered at median
            cost += Math.abs(pos.get(i) - (pos.get(mid) - mid + i));
        }
        return cost;
    }

    public static long solve(String s){
        return Math.min(minSwaps(s, 'a'), minSwaps(s, 'b'));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            System.out.println(solve(s));
        }
    }
}