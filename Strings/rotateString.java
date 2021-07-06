//Rotate String

package EasyQuestions.Strings;
import java.util.Scanner;

public class rotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String target = sc.next();
        rotateString(str, target);
    }

    private static void rotateString(String str, String target) {

        if(str=="" && target=="")
            System.out.println(true);
            
        int flag = 1;
        for (int i = 1; i < str.length(); i++) {
            String firstLetter = str.substring(0, i);
            String restOfStr = str.substring(i);
            String newStr = restOfStr + firstLetter;

            if (newStr.equals(target)) {
                System.out.println(true);
                break;
            } else {
                flag = 0;
            }
        }
        if(flag == 0) {
            System.out.println(false);
        }
    }
}
