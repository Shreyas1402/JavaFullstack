package CompanyQuestions;

public class Stringsofequallength {

    public static String solve(String input){
        int n=input.length();
        int i=n/3;
        int k;
        int j;
        String start="";
        String end="";
        String mid="";
        for( j=0;j<=i;j++){
            start+=input.charAt(j);
        }
        for( k=n-1;k>=n-1-i;k--){
            end+=input.charAt(k);
        }
        if(end.length()==start.length()){
          for(int m=k;m<=j;m++ ){
              mid+=mid+input.charAt(m);
          }
        }
        int s=start.length()-1;
        int be=0;
        System.out.println(start.charAt(be));
        //start.replace('c','r');
        System.out.println(start);
        while(be<s){
            char temp=start.charAt(s);
            start.replace(start.charAt(s),start.charAt(be));
            System.out.println(start);
            //start.re;
            be++;
            s--;
        }

        System.out.println(start);
        System.out.println(mid);
        System.out.println(end);


        return " ";
    }

    public static void main(String[] args) {
        solve("racecar");
    }
}
