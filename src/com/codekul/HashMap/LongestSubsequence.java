package com.codekul.HashMap;

import java.util.HashMap;

public class LongestSubsequence {
    public static void main(String[] args) {


        int A[]={9,1,2,4,5,6,7,8,10,11};
        int max=0;
        int start=0;
        int end=0;
        int temp1=0;
        int temp2=0;

        HashMap<Integer,Integer>M=new HashMap<>();
        for(int i=0;i<A.length;i++){
            int count=0;
            int num=A[i];


            M.put(A[i],1);
         temp1=num+1;
            while(M.containsKey(temp1)){
                temp1++;
                count++;
            }
            //start=temp;
           temp2=num-1;
            while(M.containsKey(temp2)){
                temp2--;
                count++;
            }
            // end =temp;
            if(count>max){
               start=temp1;
               end =temp2;
                max=count;
            }
        }
        System.out.println(max+1);
       // System.out.println("the starting number is: "+start  +"the ending number is: "+end);
    }
}
