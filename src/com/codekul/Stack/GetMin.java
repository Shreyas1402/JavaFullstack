package com.codekul.Stack;

import java.util.Stack;

public class GetMin {
    int min=Integer.MAX_VALUE;
    Stack<Integer>s=new Stack<>();
    public void push(int x){
        s.add(x);
        if(x<min){
            x=min;
        }
    }
    public int getMin(){
        return -1;
    }
}
