package com.codekul.Arrays;

import java.util.ArrayList;

public class Kth_SMALLEST_IN_A_RANGE_OF_N {

    public static ArrayList<Integer> kthSmallestNum(int n, int[][] range, int q, int[] queries) {
        ArrayList<Integer>A=new ArrayList<>();
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++){

            int mini=range[i][0];
            //  System.out.println(range[i][n-1]);
            int max=range[i][n-1];

            for(int j=mini;j<=max;j++){
                if(A.contains(j)){
                    continue;
                }
                else{
                    A.add(j);
                }
            }
        }
        System.out.println(A);


        for(int i=0;i<q;i++){
            if(queries[i]>=A.size()){
                ans.add(-1);
            }
            else{
                ans.add(A.get(queries[i])-1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int range[][]={{1,2,9,12},{5,7,10,24},{12,14,16,29},{24,28,32,40}};
        int queries[]={2,6,10,100};
        int n=4;
        int q=4;
        System.out.println(kthSmallestNum(n,range,q,queries));
    }
}


