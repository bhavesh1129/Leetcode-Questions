// Four Sum

package EasyQuestions.Arrays;

import java.util.*;

public class fourSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        ArrayList<List<Integer>> ans = fourSum(arr, target);
        System.out.println(Arrays.asList(ans));
    }

    private static ArrayList<List<Integer>> fourSum(int[] arr, int target) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 3; i++) {
            if (i != 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < arr.length - 2; j++) {
                if (j != i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }
                int left = j + 1;
                int right = arr.length - 1;
                while (left < right) {
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        ArrayList<Integer> list = new ArrayList<Integer>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[left]);
                        list.add(arr[right]);
                        res.add(list);

                        left++;
                        right--;

                        while (left < right && arr[left] == arr[left - 1]) {
                            left++;
                        }
                        while (left < right && arr[right] == arr[right + 1]) {
                            right--;
                        }
                    }
                }
            }
        }
        return res;
    }
}
