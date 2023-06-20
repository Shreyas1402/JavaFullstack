package CompanyQuestions;

import java.util.*;

public class InformaticaQuestion {
    public static void solve(ArrayList<Integer>x, int k){
        ArrayList<Integer>B=new ArrayList<>();
        TreeMap<Integer,Integer>A=new TreeMap<>();
        for(int i=0;i<x.size()-1;i=i+k){
            String s="";
            for(int j=i;j<i+k;j++){
                s=s+x.get(j).toString();
            }
            int val=Integer.parseInt(s);
             A.put(val,s.length()-1);
            //System.out.println(A);

        }

        for(Map.Entry<Integer,Integer> it:A.entrySet()){
            int value= it.getKey();
          double e=Math.pow(10.0, it.getValue());
          int d=(int) e;





            B.add(value/d);
            B.add(value%d);
        }
        System.out.println(B);
        }





    public static void main(String[] args) {
        ArrayList<Integer>x=new ArrayList<>();
        x.add(1);
        x.add(32);
        x.add(5);
        x.add(6);
        x.add(9);
        x.add(3);
        solve(x,3);

    }
}
