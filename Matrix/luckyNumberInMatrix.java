//Lucky Number In Matrix 

package EasyQuestions.Matrix;

import java.util.*;

public class luckyNumberInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(luckyNumberInMatrix(matrix));
    }

    private static Integer luckyNumberInMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] temp = new int[row * col];
        int k = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                temp[k++] = matrix[i][j];
            }
        }
        Arrays.sort(temp);
        return (temp[temp.length - col]);
    }
}