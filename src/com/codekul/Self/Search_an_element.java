package com.codekul.Self;

public class Search_an_element {
    public void find(int[] arr, int val) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == val) {
                System.out.println("THE ELEMENT IS PRESENT AT :" + i);
            }


        }
    }
}
    class Main{
        public static void main(String[] args) {
            int []arr={1,2,3,4,5,6,7,8,9,10};
            Search_an_element A=new Search_an_element();
            A.find(arr,6);

        }
    }

