package com.codekul.Strings;

public class Occuranceof012 {
    public static void String(String S){
        int iof0=-1;
        int iof1=-1;
        int iof2=-1;
        boolean a=false;
        int ans=0;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='0'){
                iof0=i;
            }
            if(S.charAt(i)=='1'){
                iof1=i;
            }
            if(S.charAt(i)=='2'){
                iof2=i;
            }

            if(iof0!=-1&&iof2!=-1&&iof1!=-1){

                ans=i-Math.min(iof0,Math.min(iof2,iof1))+1;
                if(max>ans){
                    max=ans;
                }
                a=true;
            }
        }
        if(a){
            System.out.println(max);
        }
        else{
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        String S="02222222211111111";
        String(S);

    }
}
