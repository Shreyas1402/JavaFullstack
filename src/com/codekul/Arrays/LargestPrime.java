package com.codekul.Arrays;

public class LargestPrime {

        public static int getLargestPrime(int number){
             boolean flag=true;
            int maxNum = 0;
            if (number < 0){
                return -1;
            }
            else {
                for (int i = number/2; i >= 1; i--){
                    if ( number%i == 0){
                        for (int j = 2; j < i ; j++){
                            if (i%j == 0){
                               // boolean flag=
                                break;
                            }
                        }

                        }
                    }
                }
                return maxNum;
            }



    public static int Get(int N){
            int max=0;
        if(N<2){
            return -1;
        }
        for(int i=2;i<=N;i++){
            int x=N%i;
            if(x==0){
                boolean flag=true;
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        flag=false;
                        break;
                    }

                }
                 if(flag) {
                     if (i > max) {
                         max = i;
                     }
                 }
            }
        }
        return max;
    }



    public static void main(String[] args) {
       int a= getLargestPrime(21);
        System.out.println(a);
        int b=Get(31);
        System.out.println(b);
    }
    }

