package com.codekul.BinaryHeap;

public class BinaryHeap {
    int arr[];
    int size;
    int capacity;
    BinaryHeap(int capacity){
        this.capacity=capacity;
        arr=new int [capacity];
        size=0;

    }

    public int leftchild(int i){
        return 2*i+1;
    }

    public int rightchild(int i){
        return 2*i+2;
    }

    public int parent(int i){
        return (i-1)/2;
    }



    public void Insert(int x){
        if(size==capacity){
            System.out.println("sorry heap full");
            return;
        }
        size++;
        arr[size-1]=x;
        for(int i=size-1;i>=0&&arr[parent(i)]>arr[i];){
            int temp=arr[parent(i)];
            arr[parent(i)]=arr[i];
            arr[i]=temp;
            i=parent(i);
        }


    }


    public void  Heapify(int i){
        int lh=leftchild(i);
        int rh=rightchild(i);
        int smallest=i;

        if(lh<size&&arr[lh]<arr[i]){
            smallest=lh;
        }
        if(rh<size&&arr[rh]<arr[smallest]){
            smallest=rh;
        }
        if(smallest!=i){
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;

            Heapify(smallest);
        }
    }


    public int extractMin(){
        if(size==0){
            return Integer.MIN_VALUE;
        }
        int ans=arr[0];
        arr[0]=arr[size-1];
        arr[size-1]=0;
        size--;

        Heapify(0);

        return ans;
    }

    public void print(){
        for(int i:arr)
        System.out.print(i+" ");
    }

     public void delete(int x){
        arr[x]=arr[size-1];
        arr[size-1]=0;
        size--;
        int i=x;
        while(i>0&&arr[parent(i)]>arr[i]){
            int temp=arr[i];
            arr[i]=arr[parent(i)];
            arr[parent(i)]=temp;

            i=parent(i);
        }
     }


}
