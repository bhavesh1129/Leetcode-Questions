//Missing Number

package EasyQuestions.Logical;

import java.util.*;

public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = missingNumber(arr);
        System.out.println(ans);
    }

    private static int missingNumber(int[] arr) {
        int len = arr.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += arr[i];
        }
        return (len * (len + 1) / 2) - sum;
    }
}
