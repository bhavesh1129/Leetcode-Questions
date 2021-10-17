package hashset;

import java.util.Scanner;

public class LuckyIntegerInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findLucky(arr));
    }

    private static int findLucky(int[] arr) {
        int[] freq = new int[501];
        for(int i : arr){
            ++freq[i];
        }
        for(int i = 500; i > 0; i--){
            if(freq[i] == i){
                return i;
            }
        }
        return -1;
    }
}
