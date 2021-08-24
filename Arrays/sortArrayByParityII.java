// Sort Array By Parity II

package EasyQuestions.Arrays;

import java.util.*;

public class sortArrayByParityII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = sortArrayByParityII(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] sortArrayByParityII(int[] arr) {
        int[] newArr = new int[arr.length];
        int k = 0, x = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                newArr[k] = arr[i];
                k += 2;
            } else {
                newArr[x] = arr[i];
                x += 2;
            }
        }
        return newArr;
    }
}
