// Height Checker
package EasyQuestions.Arrays;

import java.util.*;

public class heightChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = heightChecker(arr);
        System.out.println(ans);
    }

    private static int heightChecker(int[] arr) {
        int res = 0;
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        Arrays.sort(newArr);
        for (int i = 0; i < newArr.length; i++) {
            if (arr[i] != newArr[i]) {
                res++;
            }
        }
        return res;
    }
}