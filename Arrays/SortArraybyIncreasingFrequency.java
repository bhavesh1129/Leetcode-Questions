//Sort Array by Increasing Frequency

package EasyQuestions.Arrays;
import java.util.Scanner;

public class SortArraybyIncreasingFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sortArraybyIncreasingFrequency(num, arr);
    }

    private static void sortArraybyIncreasingFrequency(int num, int[] arr) {
        
    }
}
