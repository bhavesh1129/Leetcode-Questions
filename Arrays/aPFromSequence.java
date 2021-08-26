//Arithmetic Progression From Sequence

package EasyQuestions.Arrays;

import java.util.*;

public class aPFromSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ans = aPFromSequence(arr);
        System.out.println(ans);
    }

    private static boolean aPFromSequence(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff)
                return false;
        }
        return true;
    }
}
