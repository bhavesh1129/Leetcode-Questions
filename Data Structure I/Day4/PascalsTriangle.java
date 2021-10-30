package com.bhavesh;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        List<List<Integer>> res = generate(n);
        System.out.println(Arrays.asList(res));
    }

    private static List<List<Integer>> generate(int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row, pre = null;

        for (int i = 0; i < n; i++) {
            row = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(pre.get(j - 1) + pre.get(j));
                }
            }
            pre = row;
            res.add(row);
        }
        return res;
    }
}
