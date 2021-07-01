//Sum Of Diagonal Elements Of A Matrix

package EasyQuestions.Arrays;
import java.util.Scanner;

public class SumOfDiagonalElementsOfAMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] matrix = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sumOfDiagonalElementsOfAMatrix(num, matrix);
    }

    private static void sumOfDiagonalElementsOfAMatrix(int num, int[][] matrix) {
        int prinDiag = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j) {
                    prinDiag += matrix[i][j];
                }
                if ((i + j) == (num - 1)) {
                    if (i != j) {
                        prinDiag += matrix[i][j];
                    }
                }
            }
        }
        System.out.println(prinDiag);
    }
}
