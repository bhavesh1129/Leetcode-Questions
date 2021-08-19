//SquareRoot of a number without any buit in function

package EasyQuestions.Logical;

import java.util.Scanner;

public class squareRoot {
    public static void main(String[] args) {                   
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(squareRoot(num));

    }

    private static int squareRoot(int num) {
        int start = 0;
        int end = num;
        int res = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid <= num / mid) {
                res = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }
}