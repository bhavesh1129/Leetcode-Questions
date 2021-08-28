//3 Sum

package EasyQuestions.Arrays;

import java.util.*;

public class threeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<List<Integer>> ans = threeSum(arr);
        System.out.println(Arrays.asList(ans));
    }

    private static ArrayList<List<Integer>> threeSum(int[] arr) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if (i != 0 && arr[i] == arr[i - 1])
                continue;

            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                if (j != i + 1 && arr[j] == arr[j - 1]) {
                    j++;
                    continue;
                }
                if (k != arr.length - 1 && arr[k] == arr[k + 1]) {
                    k--;
                    continue;
                }

                int sum = arr[i] + arr[j] + arr[k];
                if (sum == 0) {
                    res.add(Arrays.asList(arr[i], arr[j++], arr[k]));
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }

        }
        return res;
    }
}