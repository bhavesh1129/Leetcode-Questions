//First and Last Position of Element in Sorted Array

package EasyQuestions.Arrays;

import java.util.*;

public class firstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] res = firstAndLastPositionOfElementInSortedArray(arr, target);
        System.out.println(Arrays.toString(res));
    }

    private static int[] firstAndLastPositionOfElementInSortedArray(int[] arr, int target) {
        boolean flag1 = true;
        boolean flag2 = true;
        int[] ans = new int[2];
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target && flag1) {
                ans[0] = i;
                flag1 = false;
            }
            if (arr[j] == target && flag2) {
                ans[1] = j;
                flag2 = false;
            }
            if (!flag1 && !flag2) {
                return ans;
            }
            j--;
        }
        ans[0] = ans[1] = -1;
        return ans;
    }
}
