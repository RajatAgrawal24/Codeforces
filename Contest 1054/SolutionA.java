
import java.util.Scanner;

public class SolutionA {

    public static int solve(int arr[]){
        int n = arr.length;
        int ct_0 = 0;
        int ct_minus1 = 0;

        for(int i=0;i<n;i++){
            if(arr[i] == 0) ct_0++;
            else if(arr[i] == -1) ct_minus1++;
        }

        return ct_0 + (ct_minus1%2)*2;
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