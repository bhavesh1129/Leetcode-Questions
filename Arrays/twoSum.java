//Two Sum

package EasyQuestions.Arrays;
import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = { 3,2,4 };
        twoSum(arr, 6);
    }

    private static void twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            int currNum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (currNum + arr[j] == target) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
