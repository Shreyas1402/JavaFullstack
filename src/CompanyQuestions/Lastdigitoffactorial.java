package CompanyQuestions;

public class Lastdigitoffactorial {
    public static long factorial(long n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        long x=factorial(44);
        System.out.println(x);
        System.out.println(x%10);
    }
}
