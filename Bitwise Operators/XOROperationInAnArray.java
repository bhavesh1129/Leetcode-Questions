package bitwise;

import java.util.Scanner;

public class XOROperationInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int start = sc.nextInt();
        System.out.println(xorOperation(num, start));
    }

    private static int xorOperation(int num, int start) {
        int[] arr = new int[num];
        int ans = 0;
        for (int i = 0; i < num; i++) {
            arr[i] = start + 2 * i;
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
