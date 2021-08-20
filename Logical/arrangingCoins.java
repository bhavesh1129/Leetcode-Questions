// Arranging Coins

package EasyQuestions.Logical;

import java.util.*;

public class arrangingCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(arrangingCoins(num));
    }

    private static int arrangingCoins(int num) {
        long start = 1;
        long end = num;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long sum = mid * (mid + 1) / 2;// help us to determine the sum of number untill that row
            if (sum == num) {
                return (int) mid;
            } else if (sum > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return (int) end;
    }
}