// Minimum Absolute Difference

package EasyQuestions.Arrays;

import java.util.*;

public class minimumAbsoluteDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<List<Integer>> ans = minimumAbsoluteDifference(arr);
        System.out.println(Arrays.asList(ans));
    }

    private static ArrayList<List<Integer>> minimumAbsoluteDifference(int[] arr) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(arr);

        int diff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            diff = Math.min(diff, arr[i] - arr[i - 1]);
        }
        for (int i = 1; i < arr.length; i++) {
            if (diff == (arr[i] - arr[i - 1])) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(arr[i - 1]);
                list.add(arr[i]);
                res.add(list);
            }
        }
        return res;
    }
}