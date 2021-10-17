package hashset;

import java.util.*;

public class SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        frequencySort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] frequencySort(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int a : arr) {
            list.add(a);
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        Collections.sort(list, (a, b) -> {
            int f1 = map.get(a);
            int f2 = map.get(b);
            if (f1 != f2) return f1 - f2;
            return b - a;
        });
        int i = 0;
        int[] freq = new int[list.size()];
        for (int val : list) {
            freq[i++] = val;
        }
        return freq;
    }
}
