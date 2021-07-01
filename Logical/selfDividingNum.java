//Self Dividing Number

package EasyQuestions.Logical;
import java.util.*;

public class selfDividingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leftNum = sc.nextInt();
        int rightNum = sc.nextInt();
        selfDividingNum(leftNum, rightNum);
    }

    private static List<Integer> selfDividingNum(int leftNum, int rightNum) {
        List<Integer> res = new ArrayList<>();
        int num = leftNum;
        while (num <= rightNum) {
            if (isValid(num))
                res.add(num);
            num++;
        }
        return res;
    }

    static boolean isValid(int num) {
        int x = num, y = 0;
        while (x != 0) {
            y = x % 10;
            if ((y == 0) || (num % y) != 0)
                return false;
            x /= 10;
        }
        return true;
    }
}
