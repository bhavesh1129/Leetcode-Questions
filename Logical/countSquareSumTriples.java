// Count Square Sum Triples

package EasyQuestions.Logical;

import java.util.*;

public class countSquareSumTriples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(countSquareSumTriples(num));
    }

    private static int countSquareSumTriples(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = i + 1; j <= num; j++) {
                int val = (i * i) + (j * j);
                int sqrootVal = (int) Math.sqrt(val);
                if (sqrootVal * sqrootVal == val && sqrootVal <= num) {
                    count += 2;
                }
            }
        }
        return count;
    }
}
