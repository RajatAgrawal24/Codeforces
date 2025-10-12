import java.util.*;

public class SolutionE {

    public static long countSubarrays(int[] arr, int k, int l, int r) {
        int n = arr.length;
        long ans = 0;

        Map<Integer, Integer> freq = new HashMap<>();
        int i = 0;
        int dist = 0;

        for (int j = 0; j < n; j++) {
            freq.put(arr[j], freq.getOrDefault(arr[j], 0) + 1);
            if (freq.get(arr[j]) == 1) dist++;

            // shrink window until at most k dist
            while (dist > k) {
                freq.put(arr[i], freq.get(arr[i]) - 1);
                if (freq.get(arr[i]) == 0) dist--;
                i++;
            }

            // calculate number of valid subarrays ending at j with length [l,r]
            int len = j - i + 1;
            int add = Math.max(0, Math.min(len, r) - (l - 1));
            ans += add;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            System.out.println(countSubarrays(arr, k, l, r) - countSubarrays(arr, k - 1, l, r));
        }
    }
}
