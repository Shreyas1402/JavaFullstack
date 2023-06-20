package com.codekul.Greedy;


import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

class Item {
    int value;
    int weight;

    Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }

   // public int compareTo(Item i) {
  //      return this.value * i.weight-this.weight * i.value;
//
       // return this.weight * i.value - this.value * i.weight;
    //}
}


    public class Fractional_Knapsack {

        static double fractionalknap(Item arr[], int W) {
            Arrays.sort(arr,(a,b)->b.value*a.weight-a.value*b.weight);
            double res = 0.0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].weight <= W) {
                    res = res + arr[i].value;
                    W = W - arr[i].weight;
                } else {
                    res = res + arr[i].value * ((double) W / arr[i].weight);
                }
            }
            return res;
        }
        public static void print(Item arr[]){
            int j=1;
            for (Item i:arr){
                System.out.println(j+" "+i.value+" "+i.weight);
                j++;
            }
        }

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("ENTER THE NUMBER OF ITEMS ");
            int n = s.nextInt();
            Item arr[] = new Item[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter the value");
                int v = s.nextInt();
                System.out.println("Enter the weight");
                int we = s.nextInt();
                arr[i] = new Item(v, we);
            }

            System.out.println(fractionalknap(arr, 70));
            print(arr);
        }
    }
