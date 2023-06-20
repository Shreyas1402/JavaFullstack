package com.codekul.Arrays;

public class ArrayDsa {
    int []arr;

    public ArrayDsa(int size) {
        arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    public void Insert(int loc ,int val){
        if(arr[loc]==Integer.MIN_VALUE){
            arr[loc]=val;
            System.out.println("successfully inserted");
        }
        else{
            System.out.println("THE ARRAY IS FULL");
        }
    }
    public void traverse(){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public void Access(int loc){
        if(loc> arr.length-1){
            System.out.println("SORRY");
        }
        else
        System.out.println(arr[loc]);

    }

}
 class Main{
     public static void main(String[] args) {
         ArrayDsa A=new ArrayDsa(6);
         A.Insert(0,10);
         A.Insert(1,12);
         A.Insert(2,72);
         A.Insert(3,42);
         A.Insert(4,62);
         A.Insert(5,52);
         A.traverse();
         A.Access(4);

     }

}


