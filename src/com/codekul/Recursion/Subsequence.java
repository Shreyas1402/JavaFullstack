package com.codekul.Recursion;

import com.codekul.Static.StaticBlock;

import java.util.ArrayList;

public class Subsequence {
  static ArrayList<String> A=new ArrayList<>();
  public static void find(String s,String ans){
      if(s.length()==0){
          A.add(ans);
          System.out.println(A);
          return;
      }
      find(s.substring(1),ans + s.charAt(0));
      find(s.substring(1),ans);

  }



    public static void main(String[] args) {
      String S="ABC";
      find(S,"");

        System.out.println(A);

    }
    }
