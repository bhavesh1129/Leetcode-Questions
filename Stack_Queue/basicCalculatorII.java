//Basic Calculator II

package EasyQuestions.Stack_Queue;
import java.util.*;

public class basicCalculatorII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(basicCalculatorII(str));
    }

    private static int basicCalculatorII(String str) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for (int i = 0, num = 0, op = '+'; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c))
                num = num * 10 + (c - '0');

            if ("+-*/".indexOf(c) >= 0 || i == str.length() - 1) {

                if ("*/".indexOf(op) >= 0)
                    result -= stack.peek();
                switch (op) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop() * num);
                        break;
                    case '/':
                        stack.push(stack.pop() / num);
                        break;
                }

                num = 0;
                op = c;
                result += stack.peek();
            }
        }
        return result;
    }
}
