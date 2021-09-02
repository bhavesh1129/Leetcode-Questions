//Find Greatest Common Divisor of Array

package EasyQuestions.Logical;

import java.util.*;

public class greatestCommonDivisorOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = greatestCommonDivisorOfArray(arr);
        System.out.println(ans);
    }

    private static int greatestCommonDivisorOfArray(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for ( int i= min ; i >= 1 ;i--) {
            if (max % i == 0 && min % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
