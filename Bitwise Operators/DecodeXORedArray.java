package bitwise;

import java.util.Arrays;
import java.util.Scanner;

public class DecodeXORedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] encoded = new int[n];
        for (int i = 0; i < encoded.length; i++) {
            encoded[i] = sc.nextInt();
        }
        int first = sc.nextInt();
        int[] ans = decode(encoded, first);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            arr[i + 1] = encoded[i] ^ arr[i];
        }
        return arr;
    }
}
