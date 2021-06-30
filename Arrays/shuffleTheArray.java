//Shuffle The Array

package Arrays;
import java.util.Scanner;

public class shuffleTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int size = sc.nextInt();
        int[] ans = shuffleTheArray(arr, size);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }

    private static int[] shuffleTheArray(int[] arr, int size) {
        int left = 0;
        int mid = size;
        int newArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i = i + 2) {
            newArr[i] = arr[left++];
            newArr[i + 1] = arr[mid++];
        }
        return newArr;
    }
}
