//Find Smallest Letter Greater Than Target

package EasyQuestions.Strings;
import java.util.Scanner;

public class smallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char[] charArr = sc.next().toCharArray();
        char target = sc.next().charAt(0);
        smallestLetterGreaterThanTarget(charArr, target);
    }

    private static void smallestLetterGreaterThanTarget(char[] charArr, char target) {
        int len = charArr.length;
        int low = 0;
        int high = len;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (charArr[mid] > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(charArr[low % len]);
    }
}
