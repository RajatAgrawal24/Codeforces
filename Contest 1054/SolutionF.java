
import java.util.*;

public class SolutionF {

    public static long solve(int h, int d){
        long pos = 0;        // current position
        long health = h;     // current health
        long consec = 0;     // consecutive moves cost counter
        long turns = 0;      // total turns

        while (pos < d) {
            if (health > consec) { // Make a move
                consec++;
                health -= consec;
                pos++;
                turns++;
            } else { // Rest
                health++;
                consec = 0;
                turns++;
            }
        }

        return turns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int h = sc.nextInt();
            int d = sc.nextInt();

            System.out.println(solve(h, d));
        }
    }
}