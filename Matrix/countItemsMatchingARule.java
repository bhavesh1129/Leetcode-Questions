// Count Items Matching a Rule

package EasyQuestions.Matrix;

import java.util.*;

public class countItemsMatchingARule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        ArrayList<ArrayList<String>> matrix = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < row; i++) {
            ArrayList<String> list = new ArrayList<String>();
            matrix.add(list);
            for (int j = 0; j < col; j++) {
                list.add(sc.next());
            }
        }
        String ruleKey = sc.next();
        String ruleValue = sc.next();
        System.out.println(countItemsMatchingARule(matrix, ruleKey, ruleValue));
    }

    private static int countItemsMatchingARule(ArrayList<ArrayList<String>> matrix, String ruleKey, String ruleValue) {
        int count = 0, flag = 0;
        if (ruleKey.equals("color")) {
            flag = 1;
        } else if (ruleKey.equals("name")) {
            flag = 2;
        }
        for (int i = 0; i < matrix.size(); i++) {
            if (matrix.get(i).get(flag).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
