package com.codekul.Queue;

public class QueueArray {
   static int arr[]=new int[10];
    static int size=0;


    public static void enqueue(int x){

        arr[size]=x;
        size++;

    }
    public static int dequeue(){
        int ans=arr[0];
        for(int i=0;i<size-1;i++){
            arr[i]=arr[i+1];

        }
        size--;
        return ans;
    }
    public static int getFront(){
        return arr[0];
    }
    public static int getEnd(){
        return arr[size-1];
    }

    public static boolean iSEmpty(){

    return (size==-1);
    }
    public static void print(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void rotate(int a[],int k) {
        while (k > 0) {
            int temp = a[0];

            for (int i = 1; i < a.length; i++) {
               a[i-1]=a[i];
            }
            a[a.length-1]=temp;
            k--;
        }

    }
    public static void print(int a[]){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {




        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(13133);
        dequeue();
        enqueue(40);
        dequeue();
        dequeue();
        print();
        //System.out.println();
        //System.out.println(size);
        //System.out.println(getEnd());
        //System.out.println(getFront());

        int a[]={1,2,3,4,5};
        rotate(a,3);
        System.out.println();
        print(a);

    }

}
