package com.codekul.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashMap_Functions {
    public static void main(String[] args) {
        HashMap<String ,Integer> map= new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        System.out.println(map.size());
        System.out.println(map.get("a"));
        map.put("a",4);
        System.out.println(map.size());
        System.out.println(map.get("a"));
        HashMap<Integer,Boolean> m= new HashMap<>();
        ArrayList<Integer>A=new ArrayList<>();
        int arr[]={1,2,1,3,1,1};
        Arrays.sort(arr);
          int max_count=0;
        for(int i=0;i<arr.length;i++){
            int count =0;
            if(m.containsKey(arr[i])){
                count++;

            }
            if(count>max_count){
                max_count=count;
            }

            m.put(arr[i],true);
            A.add(arr[i]);

        }

        System.out.println("aadasda = "+ m.size());
        System.out.println(m);
        System.out.println(A);



    }
}
