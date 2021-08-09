//Toeplitz Matrix

package EasyQuestions.Matrix;
import java.util.Scanner;

public class toeplitzMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(toeplitzMatrix(row, col, matrix));
    }

    private static boolean toeplitzMatrix(int row, int col, int[][] matrix) {
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i - 1][j - 1] != matrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
