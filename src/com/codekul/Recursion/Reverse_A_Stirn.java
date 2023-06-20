package com.codekul.Recursion;


public class Reverse_A_Stirn {

    public static String rev(String S,int n,String A){
        if(n==-1){
            return A;
        }
        A=A+S.charAt(n);

       return rev(S,n-1,A);


    }

    public static String Reverse(String S,int i,int j){
        if(i>j){
            return S;
        }
        System.out.println(i+" "+j);
        swap(S,i,j);
        return Reverse (S,i+1,j-1);
    }
    public static String swap(String S,int i,int j){
        char temp[]=S.toCharArray();
        char t=temp[i];
        temp[i]=temp[j];
        temp[j]=t;


        S=temp.toString();
        return S;

    }
    public static void main(String[] args) {
        String S="Shreyas";
        //System.out.println(   rev(S,S.length()-1,"")    );
       System.out.println(Reverse(S,0,S.length()-1));



    }
}
