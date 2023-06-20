package com.codekul.Strings;

import java.util.ArrayList;

public class Subseque {

  public static void sub(String S, int i, String curr){
      if(curr==null){
          return;
      }
      if(i>S.length()){
          return;
      }
      curr+=S.charAt(i);
      System.out.println(curr);
      sub(S,i+1,curr);
      sub(S,i,curr+S.charAt(i));
  }


    public static void main(String[] args) {
        String s="ABC";
        sub(s,0,"");
    }

}
