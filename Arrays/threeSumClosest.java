// 3Sum Closest

package EasyQuestions.Arrays;

import java.util.*;

public class threeSumClosest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans = threeSumClosest(arr, target);
        System.out.println(ans);
    }

    private static int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int closestSum = arr[0] + arr[1] + arr[arr.length - 1];
        for (int i = 0; i < arr.length - 2; i++) {
            int start = i + 1;
            int end = arr.length - 1;
            while (start < end) {
                int currSum = arr[i] + arr[start] + arr[end];
                if (currSum < target) {
                    start++;
                } else {
                    end--;
                }

                if (Math.abs(currSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currSum;
                }
            }
        }
        return closestSum;
    }
}
