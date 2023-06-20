package com.codekul.OOPS;

public class DynamicArray {

     int size =6;
       int dArray[]=new int [size];
    static int j=0;

    public DynamicArray(){



         }
    public void add(int i){
        if(j==size){
            size=size+1;
        }

       dArray[j]=i;
       j++;


    }
    public void remove(int i) {
        for (int j = 0; j < dArray.length; j++) {
            if (dArray[j] == i) {
                for (int k = j; k < dArray.length-1; k++) {
                    dArray[k] = dArray[k + 1];

                }
                size--;


            }
        }
    }
        public void display(){
            for(int i=0;i<dArray.length;i++){
                System.out.print(dArray[i]+" ");
            }
          //  System.out.println(size);
        }
    }

    class H{
        public static void main(String[] args) {
            DynamicArray A=new DynamicArray();
            A.add(1);
            A.add(2);
            A.add(3);
            A.add(4);
            A.add(5);
            A.add(6);

            A.remove(3);
            A.add(4);
           // A.add(1);
            A.display();
        }
    }



