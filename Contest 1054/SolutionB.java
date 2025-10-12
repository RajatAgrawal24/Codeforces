
import java.util.*;

public class SolutionB {

    public static int solve(int arr[]){
        int n = arr.length;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }

        int max = Integer.MIN_VALUE;
        while(!pq.isEmpty()){
            int diff = Math.abs(pq.poll() - pq.poll());
            if(diff > max) max = diff;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int i=0;
        while(i++<t){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = sc.nextInt();
            }

            System.out.println(solve(arr));
        }
    }
}