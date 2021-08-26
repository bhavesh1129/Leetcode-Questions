//Average Salary

package EasyQuestions.Arrays;

import java.util.*;

public class averageSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        double[] arr = new double[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
        double ans = averageSalary(arr);
        System.out.println(ans);
    }

    private static double averageSalary(double[] arr) {
        double sum = 0;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length - 1; i++) {
            sum += arr[i];
        }
        double avg = sum / (arr.length - 2);
        return avg;
    }
}
