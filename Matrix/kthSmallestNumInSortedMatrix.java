// Kth Smallest Element in a Sorted Matrix

package EasyQuestions.Matrix;

import java.util.*;

public class kthSmallestNumInSortedMatrix {
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
        int k = sc.nextInt();
        int ans = kthSmallestNumInSortedMatrix(matrix, k);
        System.out.println(ans);
    }

    private static int kthSmallestNumInSortedMatrix(int[][] matrix, int k) {

        int[] newArr = new int[matrix.length * matrix[0].length];
        int x = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                newArr[x++] = matrix[i][j];
            }
        }
        Arrays.sort(newArr);
        return newArr[k - 1];
    }
}
