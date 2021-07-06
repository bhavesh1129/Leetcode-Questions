//Binary Sum Of Two Strings

package EasyQuestions.Strings;
import java.util.Scanner;

public class binarySumOfTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        binarySumOfTwoStrings(str1, str2);
    }

    private static void binarySumOfTwoStrings(String str1, String str2) {

        int binaryNum1 = Integer.parseInt(str1, 2);
        int binaryNum2 = Integer.parseInt(str2, 2);

        Integer sum = binaryNum1 + binaryNum2;
        System.out.println(sum.toBinaryString(sum));
    }
}
