//Two Sum II 

package EasyQuestions.Arrays;

import java.util.*;

public class twoSumII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] res = twoSumII(arr, target);
        System.out.println(Arrays.toString(res));
    }

    private static int[] twoSumII(int[] arr, int target) {
        int[] newArr = new int[2];
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                newArr[0] = start + 1;
                newArr[1] = end + 1;
                break;
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return newArr;
    }
}
