//Special Array

package EasyQuestions.Arrays;

import java.util.*;

public class specialArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = specialArray(arr);
        System.out.println(ans);
    }

    public static int check(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (target <= arr[i])
                count++;
        }
        return count;
    }

    private static int specialArray(int[] arr) {
        int ans = -1;
        for (int i = 1; i <= arr.length; i++) {
            if (check(arr, i) == i)
                ans = i;
        }
        return ans;
    }
}
