package controlflowstatements;

public class StarpatternNumber {
    public static void main(String[] args) {


        int n = 6;

        for (int i = 0;i<n;i++){
            int x=1;
            for(int j=0;j<n;j++) {
                System.out.print(x);
                x++;
            }

            System.out.println();
        }
    }
}
