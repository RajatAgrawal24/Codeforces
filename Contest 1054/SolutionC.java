
import java.util.*;

public class SolutionC {

    public static int MEX(int arr[], int k){ // Minimum Excluded Element
        int n = arr.length;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        int ans = 0;
        for(int i=0;i<k;i++){
            if(!map.containsKey(i)) ans++;
        }
        return map.containsKey(k) ? ans+(map.get(k)>=ans ? map.get(k)-ans : 0) : ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int i=0;
        while(i++<t){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = sc.nextInt();
            }

            System.out.println(MEX(arr, k));
        }
    }
}