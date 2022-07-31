package com.codekul.Self;

public class BubbleSort {
    public static void main(String[] args) {
        int a[]=new int[6];

         a[0]=14;
         a[1]=7;
         a[2]=-8;
         a[3]=121;
         a[4]=15;
         a[5]=-21;

         for(int last=a.length-1;last>0;last--){
             for(int i=0;i<last;i++){
                 if(a[i]>a[i+1]);{
                 swap(a,i,i+1);
                 }
             }

         }
         for(int i=0;i< a.length;i++){
             System.out.println(a[i]);
         }


    }
    public static void swap(int [] b,int i,int j){
        if(i==j){
            return;
        }

            int temp=b[i];
            b[i]=b[j];
            b[j]=temp;

        }

    }

