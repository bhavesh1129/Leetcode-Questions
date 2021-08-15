// Add to Array-Form of Integer

package EasyQuestions.Arrays;

import java.util.*;

public class addToArrayFormOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        ArrayList<Integer> res = addToArrayFormOfInteger(arr, k);
        System.out.println(Arrays.asList(res));
    }

    private static ArrayList<Integer> addToArrayFormOfInteger(int[] arr, int k) {
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            newArr.add((arr[i] + k) % 10);
            k = (arr[i] + k) / 10;
        }
        while (k > 0) {
            newArr.add(k % 10);
            k /= 10;
        }
        Collections.reverse(newArr);
        return newArr;
    }
}
