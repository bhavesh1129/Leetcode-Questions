// Merge Sorted Array

package Arrays;
import java.util.*;

public class mergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] num1 = new int[m];
        for (int i = 0; i < m; i++) {
            num1[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] num2 = new int[n];
        for (int i = 0; i < n; i++) {
            num2[i] = sc.nextInt();
        }

        mergeSortedArray(num1, m, num2, n);
    }

    private static void mergeSortedArray(int[] num1, int m, int[] num2, int n) {
        int[] temp = new int[m + n];
        for (int i = 0; i < m; i++) {
            temp[i] = num1[i];
        }
        int j = 0;
        for (int i = m; i < m + n; i++) {
            temp[i] = num2[j++];
        }
        Arrays.sort(temp);
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
