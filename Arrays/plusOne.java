//Plus One

package Arrays;
import java.util.Scanner;

public class plusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        PlusOne(arr);
    }

    private static void PlusOne(int[] arr) {
        int length = arr.length;
        for (int i = length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                System.out.println(arr);
            }
            arr[i] = 0;
        }
        int[] newArr = new int[length + 1];
        newArr[0] = 1;
        System.out.println(newArr);
    }
}