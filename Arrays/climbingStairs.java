//Climbing Stairs

package EasyQuestions.Arrays;
import java.util.Scanner;

public class climbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        climbingStairs(num);
    }

    private static void climbingStairs(int num) {
        int[] dp = new int[num + 1];
        dp[0] = 1;
        for (int i = 1; i <= num; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        System.out.println(dp[num]);
    }
}
