package com.codekul.Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Activity {
    int start;
    int end;
    Activity(int start,int end){
        this.start=start;
        this.end=end;
    }

}

class mycmp implements Comparator<Activity> {
    public int compare(Activity a1, Activity a2) {

        return a1.end - a2.end;
    }

}
class operation{
    static  int MaxActivity(Activity arr[]){
        Arrays.sort(arr,new mycmp());
        int res=1;
        int prev=0;

        for(int curr=1;curr< arr.length;curr++){
            if(arr[curr].start>=arr[prev].end){
                res++;
                prev=curr;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF OPERATIONS");
        int n = s.nextInt();
        Activity arr[] = new Activity[n];
        for (int i = 0; i < n; i++) {
            System.out.println("ENTER START TIME OF OPERATION " + i + ": ");
            int start = s.nextInt();
            System.out.println("ENTER END TIME OF OPERATION " + i + ": ");
            int end = s.nextInt();
            arr[i] = new Activity(start, end);
        }


        System.out.println(MaxActivity(arr));
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].start);
        }
    }
}
