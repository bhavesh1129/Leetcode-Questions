//Pascal Triangle

package Arrays;
import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] ans = pascalTriangle(num);
        System.out.println(ans);
    }

    private static int[] pascalTriangle(int num) {
        int[][] dp = new int[num + 1][num + 1];
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }
        }
        return dp[num];
    }
}
