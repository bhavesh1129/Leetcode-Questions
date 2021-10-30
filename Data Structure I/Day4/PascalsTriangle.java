package com.bhavesh;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        List<List<Integer>> res = generate(n);
        System.out.println(Arrays.asList(res));
    }

    private static List<List<Integer>> generate(int n) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> row = new ArrayList();
        for (int i = 0; i < n; i++) {
            for (int j = row.size() - 1; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1);
            res.add(new ArrayList(row));
        }
        return res;
    }
}
