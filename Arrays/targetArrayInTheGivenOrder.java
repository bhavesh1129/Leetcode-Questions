//Create Target Array in the Given Order

package EasyQuestions.Arrays;

import java.util.*;

public class targetArrayInTheGivenOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int[] idx = new int[n];
        for (int i = 0; i < idx.length; i++) {
            idx[i] = sc.nextInt();
        }
        int[] res = targetArrayInTheGivenOrder(nums, idx);
        System.out.println(Arrays.toString(res));
    }

    private static int[] targetArrayInTheGivenOrder(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] targetArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr.add(index[i], nums[i]);
        }
        for (int i = 0; i < targetArr.length; i++) {
            targetArr[i] = arr.get(i);
        }
        return targetArr;
    }
}
