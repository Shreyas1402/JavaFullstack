package com.codekul.Self;

import java.util.ArrayList;

public class ShortestPath_UBS_Exam {
    public static ArrayList<Integer> Shortest(int a[],int x,int y) {
        ArrayList<Integer> A = new ArrayList<>();
        int n = a.length;
        int i;
       int j;

        int count;
        int k = 1;
        while (k < n ) {
            count = 0;
            j=0;
            j = j + k;
            i=0;
            while (j<n) {

                if (a[j]-a[i]==k) {
                    count++;
                    }
                if(i==x&&j==y&&!A.isEmpty()){

                    count--;
                    A.add(0,A.get(0)+1);

                }
                if (y-x>1) {
                    int v =y - x;
                    int c=a.length-v;
                    c = c - 1;
                    A.add(c, A.get(c) + 1);
                }
                    i++;
                    j++;
                }

            A.add(count);
            k++;
        }
        if(A.size()<n){
            for(int l=A.size();l<n;l++){
                A.add(0);
            }
        }
        return A;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int x=2;
        int  y=4;

      ArrayList<Integer> B = Shortest(a,x,y);
        System.out.println(B);

    }
}
