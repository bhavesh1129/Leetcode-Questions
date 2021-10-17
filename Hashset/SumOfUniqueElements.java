package hashset;

import java.util.HashMap;
import java.util.Scanner;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sumOfUnique(arr));
    }

    private static int sumOfUnique(int[] arr) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if (map.get(arr[i]) == 1) res += arr[i];
            else if (map.get(arr[i]) == 2) res -= arr[i];
        }
        return res;
    }
}
