package com.codekul.Stack;

public class Main {
    public static void main(String[] args) {
        Stack newStack=new Stack(4);
        newStack.Push(1);
        newStack.Push(2);
        newStack.Push(3);
        newStack.Push(4);
        newStack.Push(5);
        newStack.Push(6);

        int a=newStack.pop();
        System.out.println(a);
        newStack.Push(7);
        int b=newStack.peek();
        System.out.println(b);
        int c= newStack.peek1();
        System.out.println(c);
        int q= newStack.length();
        System.out.println(q);
        newStack.delete();


    //  boolean result=  newStack.isEmpty();
     //   System.out.println(result);
      //  boolean result1=  newStack.isFull();
       //
        // System.out.println(result1);


    }
}
