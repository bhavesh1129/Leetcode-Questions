// Third Maximum Number

package EasyQuestions.Arrays;

import java.util.*;

public class thirdMaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = thirdMaxNum(arr);
        System.out.println(ans);
    }

    private static int thirdMaxNum(int[] arr) {
        long max = Long.MIN_VALUE;
        long mid = max;
        long min = max;
        for (int i : arr) {
            if (i > max) {
                min = mid;
                mid = max;
                max = i;
            } else if (max > i && i > mid) {
                min = mid;
                mid = i;
            } else if (mid > i && i > min) {
                min = i;
            }
        }
        return (int) (min != Long.MIN_VALUE ? min : max);
    }
}