//Find All Numbers Disappeared

package EasyQuestions.Arrays;

import java.util.*;

public class findAllNumbersDisappeared {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> res = findAllNumbersDisappeared(arr);
        System.out.println(Arrays.asList(res));
    }

    private static ArrayList<Integer> findAllNumbersDisappeared(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (j + 1 != arr[j]) {
                ans.add(j + 1);
            }
        }
        return ans;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
