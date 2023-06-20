package com.codekul.Strings;

import java.util.HashMap;

public class PatternSearch {
    public static int firstElementKTime(int[] a, int n, int k) {
        HashMap<Integer, Integer> H = new HashMap<>();
        String s;

        for (int i = 0; i < n; i++) {
            if (H.containsKey(a[i])) {
                int val = H.get(a[i]);
                    H.put(a[i], val + 1);
                    int curr=H.get(a[i]);
                    if(curr==k){
                        return a[i];
                    }

            } else {
                H.put(a[i], 1);
            }
        }
        System.out.println(H);
        return -1;
    }

    public static void main(String[] args) {

        String a="kjdksjdsjd";

        int x []={1,7,4,3,4,8,7};
        //System.out.println( firstElementKTime(a, a.length,2));
    }
}
