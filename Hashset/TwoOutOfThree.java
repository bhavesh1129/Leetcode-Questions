package hashset;

import java.util.*;

public class TwoOutOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int n3 = sc.nextInt();
        int[] arr3 = new int[n3];
        for (int i = 0; i < n3; i++) {
            arr3[i] = sc.nextInt();
        }
        List<Integer> list = twoOutOfThree(arr1, arr2, arr3);
        System.out.println(Arrays.asList(list));
    }

    private static List<Integer> twoOutOfThree(int[] arr1, int[] arr2, int[] arr3) {
        HashSet<Integer> set1 = new HashSet<>(), set2 = new HashSet<>(), set3 = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr1) {
            set1.add(i);
            set.add(i);
        }
        for (int i : arr2) {
            set2.add(i);
            set.add(i);
        }
        for (int i : arr3) {
            set3.add(i);
            set.add(i);
        }
        for (int i : set) {
            if (set1.contains(i) && set2.contains(i) || set2.contains(i) && set3.contains(i)
                    || set3.contains(i) && set1.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }
}
