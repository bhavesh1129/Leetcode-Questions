//SquareRoot of a number without any buit in function

package EasyQuestions.Logical;
import java.util.Scanner;

public class squareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        squareRoot(num);
    }

    private static void squareRoot(int num) {

        long res = num;
        while (res * res > num) {
            res = (res + (num / res)) / 2;  //-> sqrtn+1=(sqrtn+(num/sqrtn))/2
        }
        System.out.println(res);
    }
}