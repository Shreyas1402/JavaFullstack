package com.codekul.Search_Algorithims;

public class LinearSearch {
    public int Linear(int arr[], int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("THE ELEMENT IS FOUND AT THE INDEX: " + i);
                return i;

            }



        }
        System.out.println("ELEMENT NOT FOUND");
        return -1;
    }
}
class main{
    public static void main(String[] args) {
        int arr[]={1,3,4,5,7,8,0,8,6,9};
        LinearSearch L=new LinearSearch();
        L.Linear(arr,7);

    }

}



