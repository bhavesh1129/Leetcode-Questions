package bitwise;

import java.util.Scanner;

public class ComplementOfBase10Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(bitwiseComplement(num));
    }

    private static int bitwiseComplement(int n) {
        String bin = Integer.toBinaryString(n);
        System.out.println(bin);
        String str = "";
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1')
                str = str + '0';
            else
                str = str + '1';
        }
        return Integer.parseInt(str, 2);
    }
}
