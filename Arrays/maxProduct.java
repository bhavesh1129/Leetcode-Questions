//Max Product

package EasyQuestions.Arrays;

import java.util.*;

public class maxProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int res = maxProduct(arr);
        System.out.println(res);
    }

    private static int maxProduct(int[] nums) {
        int firstMax = 0;
        int secMax = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= firstMax) {
                secMax = firstMax;
                firstMax = nums[i];
            } else if (nums[i] > secMax && nums[i] <= firstMax) {
                secMax = nums[i];
            }
        }
        return ((firstMax - 1) * (secMax - 1));
    }
}
