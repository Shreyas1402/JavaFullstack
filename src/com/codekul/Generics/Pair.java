package com.codekul.Generics;

public class Pair <T,V>{
   private T pair1;
   private V pair2;

   public Pair(T pair1,V pair2){
       this.pair1=pair1;
       this.pair2=pair2;

   }
   public void setPair1(T pair1){
       this.pair1=pair1;
   }
   public T getPair1(){
       return pair1;
   }

    public V getPair2() {
        return pair2;
    }

    public void setPair2(V pair2) {
        this.pair2 = pair2;
    }
    public void print(){
        System.out.println(pair1 +" "+ pair2);
    }

}
