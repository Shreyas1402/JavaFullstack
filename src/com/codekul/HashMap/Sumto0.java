package com.codekul.HashMap;

import java.util.HashMap;

public class Sumto0 {
    public static void main(String[] args) {
        int arr[]={-2,2,-6,2,6,-2,3};

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i< args.length;i++){
        if(map.containsKey(arr[i])){
            int val=map.get(arr[i]);
            map.put(arr[i],val+1);
        }
        else{
            map.put(arr[i],1);
        }
        
        }
    }
}
