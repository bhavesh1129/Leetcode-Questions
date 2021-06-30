//Max Product of 3 Numbers

package Arrays;
import java.util.*;

public class maxProductOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        maxProductOfThreeNumbers(num);
    }

    private static void maxProductOfThreeNumbers(int[] num) {
        Arrays.sort(num);
        int size = num.length;
        int prod = Math.max(num[0] * num[1] * num[size - 1], num[size - 1] * num[size - 2] * num[size - 3]);
        System.out.println(prod);
    }
}
